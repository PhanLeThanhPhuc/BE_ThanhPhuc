import axios from "axios";
import swal from "sweetalert";
class services {
    onload = async () => {
        let { data: result } = await axios.get("http://localhost:8881/api/role/getAllRole");
        $$("dataTable").clearAll();
        $$("dataTable").parse(result);
    }

    selectedRole = (object) => {
        $$("formRole").setValues(object)
        object.isUse === "Y" ? $$("isuse").setValue(1) : $$("isuse").setValue(0)
    }

    saveRole = async () => {
        let dataForm ={
            roleId: $$("formRole").getValues().roleId,
            roleName: $$("formRole").getValues().roleName,
            isUse: $$("formRole").getValues().isUse === 1 ? "Y" : "N",
            image: "null",
            description: $$("formRole").getValues().description,
        };

       let {data:response} = await axios.post("http://localhost:8881/api/role/saveRole", dataForm);
      
        if(response.Success){
            swal("Save Role!", response.Message, "success");
            this.cLearForm();
            this.onload();
        }
        else{
            swal("False!", response.Message, "success");
        }
    }

    cLearForm = () => {
        $$("formRole").setValues('');
        $$("isuse").setValue(1);
    }
}
export default new services();
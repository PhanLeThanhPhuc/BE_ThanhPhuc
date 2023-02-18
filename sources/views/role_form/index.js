import { JetView } from "webix-jet";
// import services from "../login_form/services";
import service from "./service.js";
export default class RoleForm extends JetView {
    config() {
        return {
            view: 'form',
            id: 'roleForm',
            name: 'roleForm',
            cols: [
                {
                    view: "datatable",
                    id: "dataTable",
                    editable: true,
                    scrollX: false,
                    autoheight: true,
                    select: true,
                    columns: [
                        { id: "roleId", header: "ID", sort: "text", fillspace: 1 },
                        { id: "roleName", header: "Vai Trò", fillspace: 1 },
                        { id: "isUse", header: "Hoạt Động", fillspace: 1 },
                        { id: "description", header: "Description", fillspace: 1 },
                        
                    ],
                    data: [
                    ],
                    on: {
                        onItemDblClick: function (id) {
                            service.selectedRole(this.getItem(id.row));
                        }
                    }           
                },
                
                {
                    view: "form",
                    scroll: false,
                    // width: 300,
                    id: "formRole",
                    elements: [
                        { id: "roleId", readonly: true ,name:"roleId", view: "text", label: "ID" },
                        { id: "roleName", name:"roleName",view: "text", label: "Vai Trò" },
                        {   view:"textarea", 
                        name:"description",
                        height:150, 
                        label:"Note"  },
                        { view: "switch",name: "isUse", id:"isuse", onLabel: "On", offLabel:"Off", value: 1 ,label: "Hoạt Động"},
                        { view:"button", value:"Save" ,
                            click : service.saveRole
                        },
                        { view:"button", value:"Clear" ,
                            click : service.cLearForm
                        }, 
                    ],
                },
            ]
        }

        // thay doi lan 2
    }
    init() {
        service.onload();
    }
}

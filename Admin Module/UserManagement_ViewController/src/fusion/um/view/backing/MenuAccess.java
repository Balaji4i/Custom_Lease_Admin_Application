package fusion.um.view.backing;

import fusion.um.view.utils.ADFUtils;
import fusion.um.view.utils.JSFUtils;

import java.util.ArrayList;

import javax.faces.component.UISelectItems;

import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.OperationBinding;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandImageLink;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class MenuAccess {
    private RichPanelGroupLayout pgl1;
    private RichPanelGridLayout pgl2;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridCell gc2;
    private RichPanelGroupLayout pgl3;
    private RichOutputLabel ol1;
    private RichPanelBox pb1;
    private RichPanelBox pb2;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichPanelCollection pc1;
    private RichTable t1;
    private RichToolbar t2;
    private RichCommandImageLink cil1;
    private RichCommandImageLink cil2;
    private RichSpacer s1;
    private RichCommandButton cb1;
    private RichCommandButton cb2;
    private RichSpacer s2;
    private RichPopup p1;
    private RichDialog d1;
    private RichOutputText ot1;
    private RichCommandButton cb3;
    private UIXGroup g1;
    private RichCommandButton cb4;
    private RichSpacer s3;

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setPgl2(RichPanelGridLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGridLayout getPgl2() {
        return pgl2;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPb2(RichPanelBox pb2) {
        this.pb2 = pb2;
    }

    public RichPanelBox getPb2() {
        return pb2;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
    }

    public void setCil1(RichCommandImageLink cil1) {
        this.cil1 = cil1;
    }

    public RichCommandImageLink getCil1() {
        return cil1;
    }

    public void onClickAddSubMenu(ActionEvent actionEvent) {
        String roleId =
            JSFUtils.resolveExpression("#{viewScope.roleids}").toString();
        String count =
            JSFUtils.resolveExpression("#{viewScope.count}").toString();
        System.err.println("ss---->  " + roleId);
        System.err.println("count---->  " + count);
        if (count == "add") {
            if (roleId != null && (!roleId.equals(""))) {
                ViewObject SubmenuVo =
                    ADFUtils.findIterator("SubMenu_ROVO1Iterator").getViewObject();
                SubmenuVo.executeQuery();
                System.err.println("=======SCount=========" +
                                   SubmenuVo.getEstimatedRowCount());
                ViewObject MenuaccessVo =
                    ADFUtils.findIterator("MenuAccess_VO1Iterator").getViewObject();
                if (SubmenuVo.first() != null) {
                    RowSetIterator rs = SubmenuVo.createRowSetIterator("");
                    while (rs.hasNext()) {
                        Row r = rs.next();
                        Row currow = MenuaccessVo.createRow();
                        currow.setAttribute("SubMenuId",
                                            r.getAttribute("SubMenuId"));
                        currow.setAttribute("UserRoleId", roleId);
                        currow.setAttribute("MenuDisplay", "N");
                        currow.setAttribute("MenuControl", "N");
                        System.err.println("=======Submenu id=========" +
                                           r.getAttribute("SubMenuId"));
                        MenuaccessVo.insertRow(currow);
                    }
                }

            }
        }

    }

    public void setCil2(RichCommandImageLink cil2) {
        this.cil2 = cil2;
    }

    public RichCommandImageLink getCil2() {
        return cil2;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void onClickSync(ActionEvent actionEvent) {
        ArrayList UserMenu = new ArrayList();
        ArrayList ROVOMenu = new ArrayList();
        ViewObject UserVO =
            ADFUtils.findIterator("MenuAccess_VO1Iterator").getViewObject();
        Row Currow = UserVO.getCurrentRow();
        Object userid = Currow.getAttribute("UserRoleId");
        ViewCriteria vc = UserVO.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("UserRoleId", userid);
        vc.addRow(ViewRow);
        UserVO.applyViewCriteria(vc);
        UserVO.executeQuery();
        Row rows = UserVO.first();
        RowSetIterator rs = UserVO.createRowSet("");
        while (rs.hasNext()) {
            rows = rs.next();
            String str = rows.getAttribute("SubMenuId").toString();
            UserMenu.add(str);
        }
        System.err.println("UserMenu" + UserMenu);
        System.err.println("UserMenu size " + UserMenu.size());
        ViewObject SubmenuVo =
            ADFUtils.findIterator("SubMenu_ROVO1Iterator").getViewObject();
        SubmenuVo.executeQuery();
        //Row ro = SubmenuVo.getCurrentRow();
        RowSetIterator rst = SubmenuVo.createRowSetIterator("");
        while (rst.hasNext()) {
            Row re = rst.next();
            ROVOMenu.add(re.getAttribute("SubMenuId"));
            //            System.err.println("Rovo list" + re.getAttribute("SubMenuId"));
        }
        System.out.println("before removing usermenu" + ROVOMenu.size());
        if (ROVOMenu.size() == UserMenu.size()) {
            JSFUtils.addFacesInformationMessage("No Record to Synchronize");
        } else {
            for (int i = 0; i < ROVOMenu.size(); i++) {
                Object a = ROVOMenu.get(i);
                System.err.println("ssss--> " + a);
                if (UserMenu.toString().contains(ROVOMenu.get(i).toString())) {

                } else {
                    Row currrow = UserVO.createRow();
                    currrow.setAttribute("UserRoleId", userid);
                    currrow.setAttribute("SubMenuId", ROVOMenu.get(i));
                    currrow.setAttribute("MenuDisplay", "N");
                    currrow.setAttribute("MenuControl", "N");
                    UserVO.insertRowAtRangeIndex(0, currrow);
                    UserVO.executeQuery();
                    AdfFacesContext adfFacesContext =
                        AdfFacesContext.getCurrentInstance();
                    adfFacesContext.addPartialTarget(t1);
                    ADFUtils.invokeEL("#{bindings.Commit.execute}");
                }
            }
            JSFUtils.addFacesInformationMessage("Record Synchronized Successfully!");
        }

        ROVOMenu.clear();
        UserMenu.clear();
        ViewCriteria vcc = UserVO.createViewCriteria();
        ViewCriteriaRow ViewRoww = vcc.createViewCriteriaRow();
        ViewRoww.setAttribute("UserRoleId", userid);
        vcc.addRow(ViewRoww);
        UserVO.applyViewCriteria(vcc);
        UserVO.executeQuery();
        System.err.println("count is --->  " + UserVO.getEstimatedRowCount());
        //        System.out.println("before removing usermenu"+ROVOMenu.size());
        //       UserMenu.removeAll(ROVOMenu);
        //       System.out.println();
        //        System.out.println("after removing usermenu"+ROVOMenu.size());
        ////        ROVOMenu.removeAll(UserMenu);
        //        System.out.println("ROVO" + ROVOMenu);
        ////        System.out.println("Result"+ROVOMenu.size());
        //        System.err.println("ROVO Size " + ROVOMenu.size());
        //        if(ROVOMenu.size() == 0){
        //            JSFUtils.addFacesInformationMessage("No Record to Synchronize");
        //        }else {
        //            ListIterator li = ROVOMenu.listIterator();
        //            while(li.hasNext()){
        //                Object str = li.next();
        //                System.err.println("Object" + str);
        //                Row currrow = UserVO.createRow();
        //                currrow.setAttribute("UserRoleId", userid);
        //                currrow.setAttribute("SubMenuId", str);
        //                UserVO.insertRow(currrow);
        //                UserVO.executeQuery();
        //            }
        //            JSFUtils.addFacesInformationMessage("Record Synchronized Successfully!");
        //        }
    }

    public void OnClickSave(ActionEvent actionEvent) {
        try {
            OperationBinding obj =
                (OperationBinding)ADFUtils.findOperation("getCommitData");
            obj.execute();
            System.err.println("=====Commit====");
            JSFUtils.addFacesInformationMessage("Information Saved Successfully!");
        } catch (Exception e) {
            System.err.println("===ERROR==" + e.toString());
        }
    }

    public void OnClickReset(ActionEvent actionEvent) {
        try {
            OperationBinding ob =
                (OperationBinding)ADFUtils.findOperation("getResetData");
            ob.execute();
            getP1().cancel();
            System.err.println("=====Reset=====");
        } catch (Exception e) {
            System.err.println("=====ERR===" + e.toString());
        }
    }

    public void onSelectRoleNameVCL(ValueChangeEvent vce) {
        System.err.println("====val===" + vce.getNewValue());
        if (vce.getNewValue() != null) {
            ViewObject menuAccessVo =
                ADFUtils.findIterator("MenuAccess_VO1Iterator").getViewObject();
            ViewObjectImpl vo = (ViewObjectImpl)menuAccessVo;
            ViewCriteria vc = vo.getViewCriteria("FindByRoleId");
            vo.applyViewCriteria(vc);
            vo.setNamedWhereClauseParam("BV_ROLE_ID", vce.getNewValue());
            vo.executeQuery();
            long count = vo.getEstimatedRowCount();
            if (count == 0) {
                JSFUtils.setExpressionValue("#{viewScope.count}", "add");
            } else {
                JSFUtils.setExpressionValue("#{viewScope.count}", "close");
            }
            JSFUtils.setExpressionValue("#{viewScope.roleids}",
                                        vce.getNewValue());
        }
    }

    public void setCb1(RichCommandButton cb1) {
        this.cb1 = cb1;
    }

    public RichCommandButton getCb1() {
        return cb1;
    }

    public void setCb2(RichCommandButton cb2) {
        this.cb2 = cb2;
    }

    public RichCommandButton getCb2() {
        return cb2;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setD1(RichDialog d1) {
        this.d1 = d1;
    }

    public RichDialog getD1() {
        return d1;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void setCb3(RichCommandButton cb3) {
        this.cb3 = cb3;
    }

    public RichCommandButton getCb3() {
        return cb3;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setCb4(RichCommandButton cb4) {
        this.cb4 = cb4;
    }

    public RichCommandButton getCb4() {
        return cb4;
    }

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }

    public void onClickClose(ActionEvent actionEvent) {
        getP1().cancel();
    }

}

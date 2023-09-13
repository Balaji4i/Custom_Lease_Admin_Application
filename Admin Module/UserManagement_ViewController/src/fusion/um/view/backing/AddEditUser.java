package fusion.um.view.backing;

import fusion.um.view.utils.ADFUtils;

import fusion.um.view.utils.JSFUtils;

import java.io.UnsupportedEncodingException;

import java.security.NoSuchAlgorithmException;

import javax.faces.component.UISelectItems;

import javax.faces.event.ActionEvent;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

public class AddEditUser {
    private RichPanelGroupLayout pgl1;
    private RichPanelGridLayout pgl2;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridCell gc2;
    private RichOutputLabel ol1;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichInputText it2;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputText it5;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichSelectOneChoice soc2;
    private UISelectItems si2;
    private RichSelectOneChoice soc3;
    private UISelectItems si3;
    private RichInputText it6;
    private RichInputText it7;
    private RichCommandButton cb1;
    private RichCommandButton cb2;
    private RichSpacer s1;
    private RichSelectBooleanCheckbox sbc1;
    private RichSelectOneChoice soc4;
    private UISelectItems si4;

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

    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
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

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi2(UISelectItems si2) {
        this.si2 = si2;
    }

    public UISelectItems getSi2() {
        return si2;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setSi3(UISelectItems si3) {
        this.si3 = si3;
    }

    public UISelectItems getSi3() {
        return si3;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
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

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void onclickCommit(ActionEvent actionEvent) {
        ADFContext.getCurrent().getSessionScope().put("Message", "");
        String Msg = "";
        System.err.println(JSFUtils.resolveExpressionAsString("#{pageFlowScope.addEdit}"));
        if (JSFUtils.resolveExpressionAsString("#{pageFlowScope.addEdit}").trim().equalsIgnoreCase("add")) {
            System.out.println("1");
            RichInputText passwd =
                (RichInputText)JSFUtils.findComponentInRoot("it2");
            RichInputText confmPass =
                (RichInputText)JSFUtils.findComponentInRoot("it7");
            System.out.println("2");
            String pwd1 =
                passwd.getValue() == null ? null : passwd.getValue().toString();
            String pwd2 =
                confmPass.getValue() == null ? null : confmPass.getValue().toString();
            System.out.println("3");
            if (pwd1 != null && pwd2 != null) {
                if (pwd1.equalsIgnoreCase(pwd2)) {
                    try {
                        System.out.println("4");
                        //                        System.out.println(((String) ADFUtils.findIterator("MosmUserTVO1Iterator").getCurrentRow().getAttribute("UserName")).toUpperCase());
                        ADFUtils.findIterator("User_VO1Iterator").getCurrentRow().setAttribute("UserName",
                                                                                               ((String)ADFUtils.findIterator("User_VO1Iterator").getCurrentRow().getAttribute("UserName")).toUpperCase());
                        //                        System.out.println(EncryptPassword.getSHA1(pwd1));
                        ADFUtils.findIterator("User_VO1Iterator").getCurrentRow().setAttribute("UserPawd",
                                                                                               EncryptPassword.getSHA1(pwd1));
                    } catch (UnsupportedEncodingException uee) {
                        JSFUtils.addFacesWarningMessage("Unexpected error raise.Please contact System Admin");
                    } catch (NoSuchAlgorithmException nsae) {
                        JSFUtils.addFacesWarningMessage("Unexpected error raise.Please contact System Admin");
                    }
                    System.out.println("5");
                    ADFUtils.invokeEL("#{bindings.Commit.execute}");
                    JSFUtils.addFacesInformationMessage("Information Saved Successfully!..");
                    Msg = "S";

                } else {
                    System.out.println("6");
                    JSFUtils.addFacesWarningMessage("Passwords and Confirm Password must match");
                    Msg = "F";
                }
            } else {
                JSFUtils.addFacesInformationMessage("Passwords and Confirm Password must be entered");
                Msg = "F";
            }
        } else {
            System.err.println("outside the if ");
        }
        if (JSFUtils.resolveExpressionAsString("#{pageFlowScope.addEdit}").equalsIgnoreCase("edit")) {
            //            System.err.println("====Edit====");
            try {
                ADFUtils.findOperation("Commit").execute();
                JSFUtils.addFacesInformationMessage("Information Saved Successfully");
                Msg = "S";
            } catch (Exception e) {
                JSFUtils.addFacesWarningMessage("" + e.toString());
            }
            ADFUtils.findIterator("User_VO1Iterator").executeQuery();
            // mo.displayMessage("User Record Saved Scuccessfully", "");
        }
        ADFContext.getCurrent().getSessionScope().put("Message", Msg);
    }

    public void onClickRollback(ActionEvent actionEvent) {
        ADFUtils.findOperation("Rollback").execute();
    }

    public void onClickClose(ActionEvent actionEvent) {
        //        getP1().cancel();
    }

    public String onclickreturn() {   
        String MSG = "";
        if (ADFContext.getCurrent().getSessionScope().get("Message").equals("S")) {
            MSG = "back";
        } else {
            MSG = "";
        }
        return MSG;
    }

    public void setSbc1(RichSelectBooleanCheckbox sbc1) {
        this.sbc1 = sbc1;
    }

    public RichSelectBooleanCheckbox getSbc1() {
        return sbc1;
    }

    public void setSoc4(RichSelectOneChoice soc4) {
        this.soc4 = soc4;
    }

    public RichSelectOneChoice getSoc4() {
        return soc4;
    }

    public void setSi4(UISelectItems si4) {
        this.si4 = si4;
    }

    public UISelectItems getSi4() {
        return si4;
    }
}

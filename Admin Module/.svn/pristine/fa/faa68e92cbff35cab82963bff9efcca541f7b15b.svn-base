package fusion.um.view.backing;

import javax.faces.event.ActionEvent;

import fusion.um.view.utils.ADFUtils;
import fusion.um.view.utils.JSFUtils;

import javax.el.ELContext;

import javax.el.ExpressionFactory;

import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.jbo.ViewObject;

public class FunctionClass {
    public FunctionClass() {
    }

    private RichPopup p1;

    public void onClickCommit(ActionEvent actionEvent) {
        ADFUtils.findOperation("Commit").execute();
        JSFUtils.addFacesInformationMessage("Record Saved Successfully!");
    }

    public void onClickRollback(ActionEvent actionEvent) {
        ADFUtils.findOperation("Rollback").execute();
    }

    public void onClickClose(ActionEvent actionEvent) {
        getP1().cancel();
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void onClickCreate(ActionEvent actionEvent) {
        ViewObject vo =
            ADFUtils.findIterator("FuncApprLevels_VO1Iterator").getViewObject();
        int count = (int)vo.getEstimatedRowCount();
        int count1 = count + 1;
        ADFUtils.findOperation("CreateInsert").execute();
        vo.getCurrentRow().setAttribute("LevelNo", count1);
    }

    public void onClickApprovalCreate(ActionEvent actionEvent) {
        ViewObject vo =
            ADFUtils.findIterator("FuncApprovals_VO1Iterator").getViewObject();
        int count = (int)vo.getEstimatedRowCount();
        int count1 = count + 1;
        ADFUtils.findOperation("CreateInsert1").execute();
        vo.getCurrentRow().setAttribute("SeqNumber", count1);
    }

    public void onClickEmpInsert(ValueChangeEvent vce) {             
//        onClickEmpins();
        System.out.println("New Value is-" + vce.getNewValue());
        if (vce.getNewValue() != null) {
            this.setvalueToExpression("#{row.bindings.UserId.inputValue}",
                                      vce.getNewValue()); //Updating Model Values
            Integer selectedCode =
                Integer.parseInt(this.getValueFrmExpression("#{row.bindings.UserId.inputValue}").toString());

            System.out.println("******** Selected Value in List***** " +
                               selectedCode);
            System.out.println("*******Display Value in List ****" +
                               getValueFrmExpression("#{row.bindings.DeptIdTrans.selectedValue.attributeValues[1]}"));

        }
    }

    /**Method to set value in Expression (EL)
     * @param el
     * @param val
     */
    public void setvalueToExpression(String el, Object val) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory =
            facesContext.getApplication().getExpressionFactory();
        ValueExpression exp =
            expressionFactory.createValueExpression(elContext, el,
                                                    Object.class);
        exp.setValue(elContext, val);
    }

    /**Method to get value from Expression (EL)
     * @param data
     * @return
     */
    public String getValueFrmExpression(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp =
            elFactory.createValueExpression(elContext, data, Object.class);
        String Message = null;
        Object obj = valueExp.getValue(elContext);
        if (obj != null) {
            Message = obj.toString();
        }
        return Message;
    }

    public void onClickChecklistCreate(ActionEvent actionEvent) {
        ViewObject vo =
            ADFUtils.findIterator("FuncChecklist_VO1Iterator").getViewObject();
        int count = (int)vo.getEstimatedRowCount();
        int count1 = count + 1;
        ADFUtils.findOperation("CreateInsert2").execute();
        vo.getCurrentRow().setAttribute("SeqNumber", count1);
    }

    public void onClickEmpins() {
        ViewObject vo =
            ADFUtils.findIterator("FuncApprovals_VO1Iterator").getViewObject();
        String user_id = vo.getCurrentRow().getAttribute("UserId").toString();
        System.err.println("userid===" + user_id);
    }
}

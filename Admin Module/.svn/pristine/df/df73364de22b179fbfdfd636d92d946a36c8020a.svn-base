package fusion.um.view.backing;

import fusion.um.view.utils.ADFUtils;


import javax.faces.component.UISelectItems;
import javax.faces.event.ActionEvent;

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
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;

public class SearchDataCombination {
    private RichPanelGroupLayout pgl1;
    private RichPanelGridLayout pgl2;
    private RichGridRow gr1;
    private RichGridCell gc1;
    private RichGridCell gc2;
    private RichOutputLabel ol1;
    private RichTable resId1;
    private RichPanelBox pb1;
    private RichPanelCollection pc1;
    private RichSpacer s1;
    private RichToolbar t1;
    private RichCommandImageLink cil1;
    private RichCommandImageLink cil2;
    private RichSpacer s2;
    String str;
    private RichPanelBox pb2;
    private RichPanelGridLayout pgl3;
    private RichGridRow gr2;
    private RichGridCell gc3;
    private RichGridCell gc4;
    private RichGridCell gc5;
    private RichGridCell gc6;
    private RichGridRow gr3;
    private RichGridCell gc7;
    private RichGridCell gc8;
    private RichGridCell gc9;
    private RichGridCell gc10;
    private RichGridRow gr4;
    private RichGridCell gc11;
    private RichGridCell gc12;
    private RichGridCell gc13;
    private RichGridCell gc14;
    private RichCommandButton cb1;
    private RichCommandButton cb2;
    private RichSpacer s3;
    private RichOutputLabel ol2;
    private RichOutputLabel ol3;
    private RichOutputLabel ol4;
    private RichOutputLabel ol5;
    private RichOutputLabel ol6;
    private RichSelectOneChoice soc6;
    private UISelectItems si6;
    private RichSelectOneChoice soc7;
    private UISelectItems si7;
    private RichSelectOneChoice soc8;
    private UISelectItems si8;
    private RichSelectOneChoice soc9;
    private UISelectItems si9;
    private RichSelectOneChoice soc10;
    private UISelectItems si10;

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


    public void setResId1(RichTable resId1) {
        this.resId1 = resId1;
    }

    public RichTable getResId1() {
        return resId1;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }

    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }

    public void setCil1(RichCommandImageLink cil1) {
        this.cil1 = cil1;
    }

    public RichCommandImageLink getCil1() {
        return cil1;
    }

    public void setCil2(RichCommandImageLink cil2) {
        this.cil2 = cil2;
    }

    public RichCommandImageLink getCil2() {
        return cil2;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public boolean getrender1() {
        boolean status = false;
        ViewObject vo =
            ADFUtils.findIterator("DataSecurity_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("SegmentColumn", "SEGMENT1");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        if (vo.first() != null) {
            status = true;
        }      
        return status;
    }

    public boolean getrender2() {
        boolean status = false;
        ViewObject vo =
            ADFUtils.findIterator("DataSecurity_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("SegmentColumn", "SEGMENT2");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        if (vo.first() != null) {
            status = true;
        }
        return status;
    }

    public boolean getrender3() {
        boolean status = false;
        ViewObject vo =
            ADFUtils.findIterator("DataSecurity_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("SegmentColumn", "SEGMENT3");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        if (vo.first() != null) {
            status = true;

        }

        return status;
    }

    public boolean getrender4() {
        boolean status = false;
        ViewObject vo =
            ADFUtils.findIterator("DataSecurity_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("SegmentColumn", "SEGMENT4");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        if (vo.first() != null) {

            status = true;

        }

        return status;
    }

    public boolean getrender5() {
        boolean status = false;
        ViewObject vo =
            ADFUtils.findIterator("DataSecurity_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("SegmentColumn", "SEGMENT5");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        if (vo.first() != null) {
            status = true;
        }
        return status;
    }

    public String getsegment1() {
        ViewObject vo =
            ADFUtils.findIterator("DataSecurity_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("SegmentColumn", "SEGMENT1");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        Row rows = vo.first();
        int count = vo.getFetchedRowCount();
        if (count >= 1) {
            str =
rows.getAttribute("ColumnName") == null ? "" : rows.getAttribute("ColumnName").toString();
            return str;
        } else {

            return null;
        }


    }

    public String getsegment2() {
        ViewObject vo =
            ADFUtils.findIterator("DataSecurity_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("SegmentColumn", "SEGMENT2");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        Row rows = vo.first();
        int count = vo.getFetchedRowCount();
        if (count >= 1) {
            str = rows.getAttribute("ColumnName") == null ? "" : rows.getAttribute("ColumnName").toString();
            return str;
        } else {

            return null;
        }

    }

    public String getsegment3() {
        ViewObject vo =
            ADFUtils.findIterator("DataSecurity_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("SegmentColumn", "SEGMENT3");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        Row rows = vo.first();
        int count = vo.getFetchedRowCount();
        if (count >= 1) {
            str =
rows.getAttribute("ColumnName") == null ? "" : rows.getAttribute("ColumnName").toString();
            return str;
        } else {

            return null;
        }

    }

    public String getsegment4() {
        ViewObject vo =
            ADFUtils.findIterator("DataSecurity_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("SegmentColumn", "SEGMENT4");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        Row rows = vo.first();
        int count = vo.getFetchedRowCount();
        if (count >= 1) {
            str =
rows.getAttribute("ColumnName") == null ? "" : rows.getAttribute("ColumnName").toString();
            return str;
        } else {

            return null;
        }

    }

    public String getsegment5() {
        ViewObject vo =
            ADFUtils.findIterator("DataSecurity_VO1Iterator").getViewObject();
        ViewCriteria vc = vo.createViewCriteria();
        ViewCriteriaRow ViewRow = vc.createViewCriteriaRow();
        ViewRow.setAttribute("SegmentColumn", "SEGMENT5");
        vc.addRow(ViewRow);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
        Row rows = vo.first();
        int count = vo.getFetchedRowCount();
        if (count >= 1) {
            str =
rows.getAttribute("ColumnName") == null ? "" : rows.getAttribute("ColumnName").toString();
            return str;
        } else {
            return null;
        }

    }

    public void setPb2(RichPanelBox pb2) {
        this.pb2 = pb2;
    }

    public RichPanelBox getPb2() {
        return pb2;
    }


    public void setPgl3(RichPanelGridLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGridLayout getPgl3() {
        return pgl3;
    }

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }

    public void setGc6(RichGridCell gc6) {
        this.gc6 = gc6;
    }

    public RichGridCell getGc6() {
        return gc6;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setGc7(RichGridCell gc7) {
        this.gc7 = gc7;
    }

    public RichGridCell getGc7() {
        return gc7;
    }

    public void setGc8(RichGridCell gc8) {
        this.gc8 = gc8;
    }

    public RichGridCell getGc8() {
        return gc8;
    }

    public void setGc9(RichGridCell gc9) {
        this.gc9 = gc9;
    }

    public RichGridCell getGc9() {
        return gc9;
    }

    public void setGc10(RichGridCell gc10) {
        this.gc10 = gc10;
    }

    public RichGridCell getGc10() {
        return gc10;
    }

    public void setGr4(RichGridRow gr4) {
        this.gr4 = gr4;
    }

    public RichGridRow getGr4() {
        return gr4;
    }

    public void setGc11(RichGridCell gc11) {
        this.gc11 = gc11;
    }

    public RichGridCell getGc11() {
        return gc11;
    }

    public void setGc12(RichGridCell gc12) {
        this.gc12 = gc12;
    }

    public RichGridCell getGc12() {
        return gc12;
    }

    public void setGc13(RichGridCell gc13) {
        this.gc13 = gc13;
    }

    public RichGridCell getGc13() {
        return gc13;
    }

    public void setGc14(RichGridCell gc14) {
        this.gc14 = gc14;
    }

    public RichGridCell getGc14() {
        return gc14;
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

    public void setS3(RichSpacer s3) {
        this.s3 = s3;
    }

    public RichSpacer getS3() {
        return s3;
    }

    public void setOl2(RichOutputLabel ol2) {
        this.ol2 = ol2;
    }

    public RichOutputLabel getOl2() {
        return ol2;
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }

    public void setOl4(RichOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public RichOutputLabel getOl4() {
        return ol4;
    }

    public void setOl5(RichOutputLabel ol5) {
        this.ol5 = ol5;
    }

    public RichOutputLabel getOl5() {
        return ol5;
    }

    public void setOl6(RichOutputLabel ol6) {
        this.ol6 = ol6;
    }

    public RichOutputLabel getOl6() {
        return ol6;
    }

    public void onClickSearch(ActionEvent actionEvent) {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        if (soc6.getValue() != null) {
            s1 = (String)soc6.getValue();
            System.err.println("S1===>" + s1);
        }
        if (soc7.getValue() != null) {
            s2 = (String)soc7.getValue();
            System.err.println("S2===>" + s2);
        }
        if (soc8.getValue() != null) {
            s3 = (String)soc8.getValue();
            System.err.println("S3===>" + s3);
        }
        if (soc9.getValue() != null) {
            s4 = (String)soc9.getValue();
            System.err.println("S4===>" + s4);
        }
        if (soc10.getValue() != null) {
            s5 = (String)soc10.getValue();
            System.err.println("S5===>" + s5);
        }
        ViewObject flwVo =
            ADFUtils.findIterator("DataCombination_ROVO1Iterator").getViewObject();
        ViewObjectImpl insVOImpl = (ViewObjectImpl)flwVo.getViewObject();
        ViewCriteria insVc = insVOImpl.getViewCriteria("SearchCombination");
        insVOImpl.setNamedWhereClauseParam("BV_S1", s1);
        insVOImpl.setNamedWhereClauseParam("BV_S2", s2);
        insVOImpl.setNamedWhereClauseParam("BV_S3", s3);
        insVOImpl.setNamedWhereClauseParam("BV_S4", s4);
        insVOImpl.setNamedWhereClauseParam("BV_S5", s5);
        flwVo.applyViewCriteria(insVc);
        flwVo.executeQuery();
        System.err.println("Estimated row count==>" +
                           flwVo.getEstimatedRowCount());
    }

    public void setSoc6(RichSelectOneChoice soc6) {
        this.soc6 = soc6;
    }

    public RichSelectOneChoice getSoc6() {
        return soc6;
    }

    public void setSi6(UISelectItems si6) {
        this.si6 = si6;
    }

    public UISelectItems getSi6() {
        return si6;
    }

    public void setSoc7(RichSelectOneChoice soc7) {
        this.soc7 = soc7;
    }

    public RichSelectOneChoice getSoc7() {
        return soc7;
    }

    public void setSi7(UISelectItems si7) {
        this.si7 = si7;
    }

    public UISelectItems getSi7() {
        return si7;
    }

    public void setSoc8(RichSelectOneChoice soc8) {
        this.soc8 = soc8;
    }

    public RichSelectOneChoice getSoc8() {
        return soc8;
    }

    public void setSi8(UISelectItems si8) {
        this.si8 = si8;
    }

    public UISelectItems getSi8() {
        return si8;
    }

    public void setSoc9(RichSelectOneChoice soc9) {
        this.soc9 = soc9;
    }

    public RichSelectOneChoice getSoc9() {
        return soc9;
    }

    public void setSi9(UISelectItems si9) {
        this.si9 = si9;
    }

    public UISelectItems getSi9() {
        return si9;
    }

    public void setSoc10(RichSelectOneChoice soc10) {
        this.soc10 = soc10;
    }

    public RichSelectOneChoice getSoc10() {
        return soc10;
    }

    public void setSi10(UISelectItems si10) {
        this.si10 = si10;
    }

    public UISelectItems getSi10() {
        return si10;
    }

    public void onClickReset(ActionEvent actionEvent) {
        soc6.setValue("");
        AdfFacesContext.getCurrentInstance().addPartialTarget(soc6);
        soc7.setValue("");
        AdfFacesContext.getCurrentInstance().addPartialTarget(soc7);
        soc8.setValue("");
        AdfFacesContext.getCurrentInstance().addPartialTarget(soc8);
        soc9.setValue("");
        AdfFacesContext.getCurrentInstance().addPartialTarget(soc9);
        soc10.setValue("");
        AdfFacesContext.getCurrentInstance().addPartialTarget(soc10);
        ViewObject flwVo =
            ADFUtils.findIterator("DataCombination_ROVO1Iterator").getViewObject();
        ViewObjectImpl insVOImpl = (ViewObjectImpl)flwVo.getViewObject();
        ViewCriteria insVc = insVOImpl.getViewCriteria("SearchCombination");
        insVOImpl.setNamedWhereClauseParam("BV_S1", "");
        insVOImpl.setNamedWhereClauseParam("BV_S2", "");
        insVOImpl.setNamedWhereClauseParam("BV_S3", "");
        insVOImpl.setNamedWhereClauseParam("BV_S4", "");
        insVOImpl.setNamedWhereClauseParam("BV_S5", "");
        flwVo.applyViewCriteria(insVc);
        flwVo.executeQuery();       
    }
}

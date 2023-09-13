package fusion.um.view.backing;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;


import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;

import oracle.adf.view.rich.component.rich.nav.RichCommandLink;


public class Home {
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichDocument d1;
    private String taskFlowId = "/taskFlow/Lookup_BTF.xml#Lookup_BTF";
    private RichRegion r1;
    private RichPanelSplitter ps1;
    private RichPanelAccordion pa1;
    private RichShowDetailItem admin;
    private RichPanelAccordion pa2;
    private RichShowDetailItem sdi1;
    private RichRegion r2;
    private RichCommandLink cl1;
    private RichCommandLink cl2;
    private RichCommandLink cl3;
    private RichCommandLink cl4;
    private RichCommandLink cl5;
    private RichCommandLink cl6;
    private RichCommandLink cl7;
    private RichPanelStretchLayout psl1;
    private RichCommandLink cl8;

    public void setPt1(RichPageTemplate pt1) {
        this.pt1 = pt1;
    }

    public RichPageTemplate getPt1() {
        return pt1;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }


    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }


    public String functions_BTF() {
        taskFlowId = "/taskFlow/Functions_BTF.xml#Functions_BTF";
        return null;
    }
    
    public String menu_BTF() {
        taskFlowId = "/taskFlow/Menu_BTF.xml#Menu_BTF";
        return null;
    }


    public void setR1(RichRegion r1) {
        this.r1 = r1;
    }

    public RichRegion getR1() {
        return r1;
    }


    public void setPs1(RichPanelSplitter ps1) {
        this.ps1 = ps1;
    }

    public RichPanelSplitter getPs1() {
        return ps1;
    }

    public void setPa1(RichPanelAccordion pa1) {
        this.pa1 = pa1;
    }

    public RichPanelAccordion getPa1() {
        return pa1;
    }

    public void setAdmin(RichShowDetailItem admin) {
        this.admin = admin;
    }

    public RichShowDetailItem getAdmin() {
        return admin;
    }


    public void setPa2(RichPanelAccordion pa2) {
        this.pa2 = pa2;
    }

    public RichPanelAccordion getPa2() {
        return pa2;
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setR2(RichRegion r2) {
        this.r2 = r2;
    }

    public RichRegion getR2() {
        return r2;
    }

    public void setCl1(RichCommandLink cl1) {
        this.cl1 = cl1;
    }

    public RichCommandLink getCl1() {
        return cl1;
    }

    public void setCl2(RichCommandLink cl2) {
        this.cl2 = cl2;
    }

    public RichCommandLink getCl2() {
        return cl2;
    }

    public void setCl3(RichCommandLink cl3) {
        this.cl3 = cl3;
    }

    public RichCommandLink getCl3() {
        return cl3;
    }

    public void setCl4(RichCommandLink cl4) {
        this.cl4 = cl4;
    }

    public RichCommandLink getCl4() {
        return cl4;
    }

    public void setCl5(RichCommandLink cl5) {
        this.cl5 = cl5;
    }

    public RichCommandLink getCl5() {
        return cl5;
    }

    public void setCl6(RichCommandLink cl6) {
        this.cl6 = cl6;
    }

    public RichCommandLink getCl6() {
        return cl6;
    }

    public void setCl7(RichCommandLink cl7) {
        this.cl7 = cl7;
    }

    public RichCommandLink getCl7() {
        return cl7;
    }

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }

    public void setCl8(RichCommandLink cl8) {
        this.cl8 = cl8;
    }

    public RichCommandLink getCl8() {
        return cl8;
    }
}

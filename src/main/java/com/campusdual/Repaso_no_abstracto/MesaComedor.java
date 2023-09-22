package com.campusdual.Repaso_no_abstracto;

public class MesaComedor extends Mesa{

    public Cubremanteles cm;
    public MesaComedor(double height, double widht, double wide, int n_legs, Material resource) {
        super(height, widht, wide, n_legs, resource);
    }

    public Cubremanteles getCm() {
        return this.cm;
    }

    public void setCm(Cubremanteles cm) {
        this.cm = cm;
    }

    public String showDetails() {
        return super.toString()+" con un cubremanteles de "+this.getCm();
    }
}

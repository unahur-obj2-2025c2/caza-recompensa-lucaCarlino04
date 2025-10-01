package ar.edu.unahur.obj2.Profugos;

public class ProteccionLegal extends DecoratorProfugo {

    public ProteccionLegal(Profugo profugo) {
        super(profugo);
    }

    @Override
    public Integer getInocencia() {
        return profugo.getInocencia() > 40 ? profugo.getInocencia() : 40;
    }

    @Override
    public Integer getHabilidad() {
        return profugo.getHabilidad();
    }

    @Override
    public Boolean esNervioso() {
        return profugo.esNervioso();
    }

    @Override
    public void volverseNervioso() {
        profugo.volverseNervioso();
    }

    @Override
    public void dejarDeEstarNervioso() {
        profugo.dejarDeEstarNervioso();
    }

    @Override
    public void reducirHabilidad() {
        profugo.reducirHabilidad();
    }

    @Override
    public void disminuirInocencia() {
        profugo.disminuirInocencia();
    }

}

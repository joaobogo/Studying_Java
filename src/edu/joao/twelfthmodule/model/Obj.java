package edu.joao.twelfthmodule.model;

public class Obj extends ObjArvore<Obj> {

    Integer meuValor;

    public Obj(Integer meuValor) {
        this.meuValor = meuValor;
    }

    @Override
    public int comparaTo(Obj outro) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Obj other = (Obj) obj;
        if (meuValor == null) {
            if (other.meuValor != null)
                return false;
        } else if (!meuValor.equals(other.meuValor))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((meuValor == null) ? 0 : meuValor.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }

    @Override
    public int compareTo(Obj o) {
        int i = 0;

        if (this.meuValor > o.meuValor) {
            i = 1;
        } else if (this.meuValor < o.meuValor) {
            i = -1;
        }
        return i;
    }

}

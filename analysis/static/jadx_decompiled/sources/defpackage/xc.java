package defpackage;

/* loaded from: classes2.dex */
public final class xc implements taf {
    public final qec a = new qec("^[a-zA-ZА-я\\u0401\\u0451\\u00eb\\u00cb\\- ]+$");

    @Override // defpackage.taf
    public final eqe a(int i, String str) {
        Integer numW;
        if (str.length() <= 0 || this.a.a(str) || (numW = fp3.w(i, nec.a(xc.class))) == null) {
            return null;
        }
        return new eqe(numW.intValue());
    }
}

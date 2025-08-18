package defpackage;

/* loaded from: classes2.dex */
public final class kq9 implements taf {
    @Override // defpackage.taf
    public final eqe a(int i, String str) {
        if (str.length() <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '-' && cCharAt != ' ') {
                return null;
            }
        }
        Integer numW = fp3.w(i, nec.a(kq9.class));
        if (numW != null) {
            return new eqe(numW.intValue());
        }
        return null;
    }
}

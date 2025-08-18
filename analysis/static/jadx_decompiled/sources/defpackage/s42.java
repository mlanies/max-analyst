package defpackage;

/* loaded from: classes.dex */
public abstract class s42 implements a7b {
    public int a(int i, CharSequence charSequence) {
        int length = charSequence.length();
        z04.m(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // defpackage.a7b
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);
}

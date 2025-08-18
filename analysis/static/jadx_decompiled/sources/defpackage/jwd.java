package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class jwd implements Iterator {
    public int Z;
    public String b;
    public final CharSequence c;
    public final s42 o;
    public final /* synthetic */ wmc s0;
    public int a = 2;
    public int Y = 0;
    public final boolean X = false;

    public jwd(wmc wmcVar, jn jnVar, CharSequence charSequence) {
        this.s0 = wmcVar;
        this.o = (s42) jnVar.c;
        this.Z = jnVar.b;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        CharSequence charSequence;
        int iA;
        s42 s42Var;
        int i = this.a;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iS = au1.s(i);
        if (iS == 0) {
            return true;
        }
        if (iS == 2) {
            return false;
        }
        this.a = 4;
        int i2 = this.Y;
        while (true) {
            int i3 = this.Y;
            if (i3 == -1) {
                this.a = 3;
                string = null;
                break;
            }
            s42 s42Var2 = (s42) this.s0.a;
            charSequence = this.c;
            iA = s42Var2.a(i3, charSequence);
            if (iA == -1) {
                iA = charSequence.length();
                this.Y = -1;
            } else {
                this.Y = iA + 1;
            }
            int i4 = this.Y;
            if (i4 == i2) {
                int i5 = i4 + 1;
                this.Y = i5;
                if (i5 > charSequence.length()) {
                    this.Y = -1;
                }
            } else {
                while (true) {
                    s42Var = this.o;
                    if (i2 >= iA || !s42Var.b(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
                while (iA > i2 && s42Var.b(charSequence.charAt(iA - 1))) {
                    iA--;
                }
                if (!this.X || i2 != iA) {
                    break;
                }
                i2 = this.Y;
            }
        }
        int i6 = this.Z;
        if (i6 == 1) {
            iA = charSequence.length();
            this.Y = -1;
            while (iA > i2 && s42Var.b(charSequence.charAt(iA - 1))) {
                iA--;
            }
        } else {
            this.Z = i6 - 1;
        }
        string = charSequence.subSequence(i2, iA).toString();
        this.b = string;
        if (this.a == 3) {
            return false;
        }
        this.a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

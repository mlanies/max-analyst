package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.a;

/* loaded from: classes2.dex */
public abstract class ga7 {
    public int a;
    public final Object b;
    public final Object c;

    public ga7(String str, int i, ha7 ha7Var) {
        this.b = str;
        this.a = i;
        this.c = ha7Var;
    }

    public static ga7 b(a aVar, int i) {
        if (i == 0) {
            return new bna(aVar, 0);
        }
        if (i == 1) {
            return new bna(aVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public String a(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(((String) this.b) + ".");
        sb.append(str);
        ha7 ha7VarL = l();
        if (ha7VarL != null && (str2 = ha7VarL.a) != null) {
            sb.append(".".concat(str2));
        }
        return sb.toString();
    }

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public ha7 l() {
        return (ha7) this.c;
    }

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.a) {
            return 0;
        }
        return n() - this.a;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public ga7(a aVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = aVar;
    }
}

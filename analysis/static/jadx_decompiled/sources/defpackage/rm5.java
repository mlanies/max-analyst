package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class rm5 {
    public final /* synthetic */ int a;
    public final SparseBooleanArray b;
    public boolean c;

    public rm5(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SparseBooleanArray();
                break;
            default:
                this.b = new SparseBooleanArray();
                break;
        }
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                np8.f(!this.c);
                this.b.append(i, true);
                break;
            default:
                fm9.k(!this.c);
                this.b.append(i, true);
                break;
        }
    }

    public void b(tm5 tm5Var) {
        for (int i = 0; i < tm5Var.a.size(); i++) {
            a(tm5Var.b(i));
        }
    }

    public void c(int... iArr) {
        for (int i : iArr) {
            a(i);
        }
    }

    public sm5 d() {
        np8.f(!this.c);
        this.c = true;
        return new sm5(this.b);
    }

    public tm5 e() {
        fm9.k(!this.c);
        this.c = true;
        return new tm5(this.b);
    }
}

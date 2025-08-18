package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.view.View;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class er0 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public Object d;
    public Object e;

    public /* synthetic */ er0() {
        this.a = 3;
    }

    public ydg a() {
        fp3.g("execute parameter required", ((ofc) this.d) != null);
        return new ydg(this, (pe5[]) this.e, this.c, this.b);
    }

    public void b(int i) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        View view = (View) bottomSheetBehavior.U.get();
                        WeakHashMap weakHashMap = zmf.a;
                        view.postOnAnimation((re) this.d);
                        this.c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        View view2 = (View) sideSheetBehavior.p.get();
                        WeakHashMap weakHashMap2 = zmf.a;
                        view2.postOnAnimation((u3c) this.d);
                        this.c = true;
                        break;
                    }
                }
                break;
        }
    }

    public void c(va8 va8Var, int i, int i2) throws GlUtil$GlException {
        int i3;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        fm9.k(arrayDeque.isEmpty());
        fm9.k(((ArrayDeque) this.e).isEmpty());
        for (int i4 = 0; i4 < this.b; i4++) {
            if (this.c) {
                mr0.b(i, i2);
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                mr0.f();
                i3 = iArr[0];
                mr0.d(3553, i3, 9729);
                GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 5131, null);
                mr0.f();
            } else {
                mr0.b(i, i2);
                int[] iArr2 = new int[1];
                GLES20.glGenTextures(1, iArr2, 0);
                mr0.f();
                i3 = iArr2[0];
                mr0.d(3553, i3, 9729);
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
                mr0.f();
            }
            arrayDeque.add(va8Var.q(i3, i, i2));
        }
    }

    public void d() throws GlUtil$GlException {
        Iterator itG = g();
        while (true) {
            n77 n77Var = (n77) itG;
            if (!n77Var.hasNext()) {
                ((ArrayDeque) this.d).clear();
                ((ArrayDeque) this.e).clear();
                return;
            }
            ((hd6) n77Var.next()).a();
        }
    }

    public void e(va8 va8Var, int i, int i2) throws GlUtil$GlException {
        if (!((n77) g()).hasNext()) {
            c(va8Var, i, i2);
            return;
        }
        hd6 hd6Var = (hd6) ((n77) g()).next();
        if (hd6Var.c == i && hd6Var.d == i2) {
            return;
        }
        d();
        c(va8Var, i, i2);
    }

    public int f() {
        return !g().hasNext() ? this.b : ((ArrayDeque) this.d).size();
    }

    public Iterator g() {
        Iterable[] iterableArr = {(ArrayDeque) this.d, (ArrayDeque) this.e};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new ms5(iterableArr).iterator();
    }

    public hd6 h() {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (arrayDeque.isEmpty()) {
            throw new IllegalStateException("Textures are all in use. Please release in-use textures before calling useTexture.");
        }
        hd6 hd6Var = (hd6) arrayDeque.remove();
        ((ArrayDeque) this.e).add(hd6Var);
        return hd6Var;
    }

    public er0(boolean z, int i) {
        this.a = 4;
        this.b = i;
        this.c = z;
        this.d = new ArrayDeque(i);
        this.e = new ArrayDeque(i);
    }

    public er0(Context context) {
        this.a = 1;
        this.d = context;
        this.e = new av1();
        this.b = jc4.g;
    }

    public er0(SideSheetBehavior sideSheetBehavior) {
        this.a = 2;
        this.e = sideSheetBehavior;
        this.d = new u3c(15, this);
    }

    public er0(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new re(6, this);
    }
}

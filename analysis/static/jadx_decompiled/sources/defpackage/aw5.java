package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class aw5 extends ppd implements y67 {
    public final m56 X;
    public final c66 Y;
    public final re6 Z;

    public aw5(ExecutorService executorService, f fVar, ut0 ut0Var, re6 re6Var) {
        super(executorService);
        this.X = fVar;
        this.Y = ut0Var;
        this.Z = re6Var;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(y9f y9fVar, int i) {
        w9f w9fVar = (w9f) ((ol7) C(i));
        View view = y9fVar.a;
        x9f x9fVar = (x9f) view;
        x9fVar.setType(w9fVar.b);
        CharSequence charSequenceA = w9fVar.c.a(y9fVar);
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        x9fVar.setTitle(charSequenceA);
        y9fVar.F0 = this.Z;
        v9f v9fVar = v9f.a;
        v9f v9fVar2 = w9fVar.b;
        if (v9fVar2 == v9fVar) {
            ((x9f) view).setOnClickListener(null);
        } else {
            tu0.K(view, 300L, new ev5(this.X, w9fVar, 1));
        }
        if (v9fVar2 == v9f.b) {
            x9f x9fVar2 = (x9f) view;
            x9fVar2.setOnDragIconTouchListener(new bk(21, y9fVar));
            x9fVar2.setActionMenuIconClickListener(new lr1(this.Y, w9fVar, y9fVar, 13));
        }
    }

    @Override // defpackage.y67
    public final void W(int i, int i2) {
        boolean z = ((w9f) ((ol7) C(i2))).b == v9f.b;
        boolean z2 = i2 <= 0 || i2 >= j();
        if (!z || z2) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.o.f);
        Object obj = arrayList.get(i);
        arrayList.remove(i);
        arrayList.add(i2, obj);
        F(arrayList, new si1(this, i, i2, arrayList));
    }

    @Override // defpackage.ppd, defpackage.hdc
    public final int l(int i) {
        int iOrdinal = ((w9f) ((ol7) C(i))).b.ordinal();
        if (iOrdinal == 0) {
            return oba.h;
        }
        if (iOrdinal == 1) {
            return oba.p;
        }
        if (iOrdinal == 2) {
            return oba.i;
        }
        if (iOrdinal == 3) {
            return oba.l;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        v9f v9fVar;
        if (i == oba.h) {
            v9fVar = v9f.a;
        } else if (i == oba.p) {
            v9fVar = v9f.b;
        } else if (i == oba.i) {
            v9fVar = v9f.c;
        } else {
            if (i != oba.l) {
                throw new IllegalStateException(zr6.h(i, "Unknown viewtype in "));
            }
            v9fVar = v9f.o;
        }
        return new y9f(new x9f(v9fVar, viewGroup.getContext()));
    }
}

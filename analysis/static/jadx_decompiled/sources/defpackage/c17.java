package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class c17 extends FrameLayout implements ov0 {
    public static final /* synthetic */ int v0 = 0;
    public float a;
    public float b;
    public long c;
    public z07 o;
    public final qv0 s0;
    public b17 t0;
    public final p44 u0;

    public c17(Context context) {
        super(context, null);
        this.a = fk4.d().getDisplayMetrics().density * 16.0f;
        this.b = fk4.d().getDisplayMetrics().density * 6.0f;
        qv0 qv0Var = new qv0(getContext());
        this.s0 = qv0Var;
        this.u0 = new p44(300L);
        qv0Var.setClickListener(this);
        qv0Var.setId(mda.L);
        addView(qv0Var, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r24, defpackage.z07 r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c17.a(long, z07, boolean):void");
    }

    public final void setClickListener(b17 b17Var) {
        this.t0 = b17Var;
    }
}

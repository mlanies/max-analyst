package ru.ok.messages.views.widgets.audiowave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import defpackage.bs0;
import defpackage.c54;
import defpackage.ee4;
import defpackage.fk4;
import defpackage.fka;
import defpackage.fm9;
import defpackage.is0;
import defpackage.khe;
import defpackage.kre;
import defpackage.s70;
import defpackage.sme;
import defpackage.tu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ok/messages/views/widgets/audiowave/AudioWaveView;", "Landroid/view/View;", "Lkre;", "Ls70;", "listener", "Le5f;", "setListener", "(Ls70;)V", "", "B0", "Z", "isIncomingMessage", "()Z", "setIncomingMessage", "(Z)V", "", "getDataWidth", "()I", "dataWidth", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class AudioWaveView extends View implements kre {
    public boolean A0;

    /* renamed from: B0, reason: from kotlin metadata */
    public boolean isIncomingMessage;
    public boolean C0;
    public s70 D0;
    public final byte[] E0;
    public final int[] a;
    public final float b;
    public final float c;
    public final float o;
    public final float s0;
    public byte[] t0;
    public int u0;
    public final Paint v0;
    public final Paint w0;
    public final Paint x0;
    public final Paint y0;
    public final Path z0;

    public AudioWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final int getDataWidth() {
        if (this.t0 == null) {
            return 0;
        }
        return (int) (((r0.length - 1) * this.c) + (r0.length * this.o));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int[] r0 = r4.a
            r4.getLocationOnScreen(r0)
            r1 = 0
            r0 = r0[r1]
            float r5 = r5.getRawX()
            int r4 = r4.getWidth()
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r4 != 0) goto L17
        L15:
            r5 = r2
            goto L29
        L17:
            int r3 = r0 + r4
            float r3 = (float) r3
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L20
            r5 = r1
            goto L29
        L20:
            float r0 = (float) r0
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 > 0) goto L26
            goto L15
        L26:
            float r5 = r5 - r0
            float r4 = (float) r4
            float r5 = r5 / r4
        L29:
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto L35
            r4 = 0
            r2 = 1
            long r4 = r4 - r2
            float r4 = (float) r4
            float r5 = r1 / r4
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.widgets.audiowave.AudioWaveView.a(android.view.MotionEvent):float");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width;
        Path path = this.z0;
        if (path.isEmpty()) {
            return;
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float width2 = ((0 / 0) * getWidth()) + 0.5f;
        boolean z = this.C0;
        float fG = tu0.G(6 * getContext().getResources().getDisplayMetrics().density);
        if (this.C0) {
            fG += tu0.G(2 * getContext().getResources().getDisplayMetrics().density);
        }
        if (z) {
            canvas.save();
            float fG2 = tu0.G(2 * getContext().getResources().getDisplayMetrics().density) + fG;
            width = width2 < fG2 ? fG2 : width2;
            if (width > getWidth() - fG2) {
                width = getWidth() - fG2;
            }
            s70 s70Var = this.D0;
            if (s70Var != null) {
                s70Var.a(width);
            }
        } else {
            width = 0.0f;
        }
        Paint paint = this.v0;
        if (!z) {
            canvas.drawPath(path, paint);
            return;
        }
        int iSave = canvas.save();
        try {
            canvas.clipRect(0.0f, 0.0f, width2, canvas.getHeight());
            canvas.drawPath(path, this.w0);
            canvas.restoreToCount(iSave);
            iSave = canvas.save();
            try {
                canvas.clipRect(width2, 0.0f, canvas.getWidth(), canvas.getHeight());
                canvas.drawPath(path, paint);
                canvas.restoreToCount(iSave);
                canvas.drawCircle(width, measuredHeight, this.s0 + fG, this.y0);
                canvas.drawCircle(width, measuredHeight, fG, this.x0);
            } finally {
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        sme smeVarR;
        is0 is0Var;
        sme smeVarR2;
        if (this.isIncomingMessage) {
            if (isInEditMode()) {
                smeVarR2 = ee4.e0;
            } else {
                Context context = getContext();
                khe kheVar = sme.a0;
                smeVarR2 = fm9.R(context);
            }
            is0Var = smeVarR2.h;
        } else {
            if (isInEditMode()) {
                smeVarR = ee4.e0;
            } else {
                Context context2 = getContext();
                khe kheVar2 = sme.a0;
                smeVarR = fm9.R(context2);
            }
            is0Var = smeVarR.g;
        }
        this.v0.setColor(is0Var.a.f);
        Paint paint = this.x0;
        bs0 bs0Var = is0Var.a;
        paint.setColor(bs0Var.e);
        this.y0.setColor(is0Var.c.a);
        this.w0.setColor(bs0Var.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.C0
            if (r0 == 0) goto L59
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L42
            r2 = 0
            if (r0 == r1) goto L2c
            r3 = 2
            if (r0 == r3) goto L15
            r3 = 3
            if (r0 == r3) goto L2c
            goto L58
        L15:
            boolean r0 = r4.C0
            if (r0 != 0) goto L1a
            goto L58
        L1a:
            boolean r0 = r4.A0
            if (r0 == 0) goto L20
            r4.A0 = r2
        L20:
            s70 r0 = r4.D0
            if (r0 == 0) goto L58
            float r4 = r4.a(r5)
            r0.d(r4)
            goto L58
        L2c:
            r4.A0 = r2
            r4.C0 = r2
            s70 r0 = r4.D0
            if (r0 == 0) goto L3a
            r4.a(r5)
            r0.b()
        L3a:
            android.view.ViewParent r4 = r4.getParent()
            r4.requestDisallowInterceptTouchEvent(r2)
            goto L58
        L42:
            r4.A0 = r1
            r4.C0 = r1
            android.view.ViewParent r0 = r4.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            s70 r0 = r4.D0
            if (r0 == 0) goto L58
            float r4 = r4.a(r5)
            r0.e(r4)
        L58:
            return r1
        L59:
            boolean r4 = super.onTouchEvent(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.widgets.audiowave.AudioWaveView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setIncomingMessage(boolean z) {
        this.isIncomingMessage = z;
    }

    public final void setListener(s70 listener) {
        this.D0 = listener;
    }

    public AudioWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.a = new int[2];
        this.z0 = new Path();
        setLayerType(1, null);
        this.b = fk4.d().getDisplayMetrics().density * 5.0f;
        this.c = fk4.d().getDisplayMetrics().density * 2.0f;
        float f = fk4.d().getDisplayMetrics().density * 2.0f;
        this.o = f;
        this.s0 = fk4.d().getDisplayMetrics().density * 2.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.v0 = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.x0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.y0 = paint3;
        this.w0 = new Paint(paint);
        c54.c(this);
        if (c54.K(this)) {
            setScaleX(-1.0f);
        }
        this.E0 = new byte[0];
    }
}

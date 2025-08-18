package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class a4g extends FrameLayout {
    public final ey1 a;
    public final z3g b;
    public boolean c;
    public boolean o;
    public f4e s0;

    public a4g(Context context) {
        super(context, null);
        ey1 ey1Var = new ey1(context);
        this.a = ey1Var;
        z3g z3gVar = new z3g(context);
        z3gVar.setId(tga.g);
        z3gVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b = z3gVar;
        addView((OneMeDraweeView) ey1Var.b);
        addView(z3gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.z2e r8, int r9) throws java.lang.InterruptedException {
        /*
            r7 = this;
            f4e r0 = r7.s0
            if (r0 == 0) goto L7
            r0.b(r8)
        L7:
            java.lang.String r0 = r8.Y
            r1 = 0
            ey1 r2 = r7.a
            r3 = 1
            z3g r4 = r7.b
            if (r0 == 0) goto L87
            int r5 = r0.length()
            if (r5 != 0) goto L19
            goto L87
        L19:
            gte r5 = new gte
            r6 = 19
            r5.<init>(r6, r7)
            r4.setOnFirstFrameListener(r5)
            r4.setVisibility(r1)
            r7.c = r3
            int r5 = r0.length()
            if (r5 != 0) goto L33
            r4.c()
        L31:
            r9 = r3
            goto L7a
        L33:
            java.lang.String r5 = r4.a
            if (r5 == 0) goto L3f
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3f
            r9 = r1
            goto L7a
        L3f:
            r4.b = r3
            r4.a = r0
            one.me.sdk.media.ffmpeg.WebmFactory$Config$Builder r5 = new one.me.sdk.media.ffmpeg.WebmFactory$Config$Builder
            r5.<init>()
            one.me.sdk.media.ffmpeg.WebmFactory$Config$Builder r5 = r5.setAutoStart(r3)
            one.me.sdk.media.ffmpeg.WebmFactory$Config$Builder r5 = r5.setAutoRepeat(r3)
            one.me.sdk.media.ffmpeg.WebmFactory$Way$Url$Builder r6 = new one.me.sdk.media.ffmpeg.WebmFactory$Way$Url$Builder
            r6.<init>()
            one.me.sdk.media.ffmpeg.WebmFactory$Way$Url$Builder r0 = r6.setUrl(r0)
            java.lang.Object r9 = r0.setSize(r9, r9)
            one.me.sdk.media.ffmpeg.WebmFactory$Way$Url$Builder r9 = (one.me.sdk.media.ffmpeg.WebmFactory.Way.Url.Builder) r9
            one.me.sdk.media.ffmpeg.WebmFactory$Way$Url$Builder r9 = r9.setNetworkFetchEnabled(r3)
            one.me.sdk.media.ffmpeg.WebmFactory$Way$Url r9 = r9.build()
            one.me.sdk.media.ffmpeg.WebmFactory$Config$Builder r9 = r5.setWay(r9)
            one.me.sdk.media.ffmpeg.WebmFactory$Config r9 = r9.build()
            one.me.sdk.media.ffmpeg.AnimatedFileDrawable r9 = one.me.sdk.media.ffmpeg.WebmFactory.create(r9)
            r9.addOnNextFrameRenderedListener(r4)
            r4.setImageDrawable(r9)
            goto L31
        L7a:
            r7.c = r1
            if (r9 == 0) goto L83
            boolean r9 = r7.o
            if (r9 != 0) goto L83
            goto L84
        L83:
            r3 = r1
        L84:
            r7.o = r1
            goto L96
        L87:
            r4.c()
            r7 = 8
            r4.setVisibility(r7)
            java.lang.Object r7 = r2.b
            one.me.sdk.uikit.common.views.OneMeDraweeView r7 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r7
            r7.setVisibility(r1)
        L96:
            if (r3 == 0) goto Lae
            r2.getClass()
            java.lang.String r7 = r8.o
            wv6 r7 = defpackage.wv6.b(r7)
            java.lang.Object r8 = r2.b
            one.me.sdk.uikit.common.views.OneMeDraweeView r8 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r8
            int r9 = one.me.sdk.uikit.common.views.OneMeDraweeView.B0
            r9 = 0
            r8.o(r7, r9)
            r8.setVisibility(r1)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4g.a(z2e, int):void");
    }

    public final void b(gw7 gw7Var) {
        if (gw7Var.a == null) {
            gw7Var.a = Collections.newSetFromMap(new WeakHashMap());
        }
        Set set = gw7Var.a;
        if (set != null) {
            set.add(this.b);
        }
    }

    public final f4e getSizeConfigurator() {
        return this.s0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        f4e f4eVar = this.s0;
        jt jtVarA = f4eVar != null ? f4eVar.a(i, i2) : null;
        if (jtVarA != null) {
            i = jtVarA.b;
        }
        if (jtVarA != null) {
            i2 = jtVarA.c;
        }
        super.onMeasure(i, i2);
    }

    public final void setSizeConfigurator(f4e f4eVar) {
        this.s0 = f4eVar;
    }
}

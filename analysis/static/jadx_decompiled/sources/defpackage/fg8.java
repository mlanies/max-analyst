package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class fg8 extends hdc {
    public final LayoutInflater X;
    public final Drawable Y;
    public final Drawable Z;
    public final ArrayList o = new ArrayList();
    public final Drawable s0;
    public final Drawable t0;
    public final /* synthetic */ gg8 u0;

    public fg8(gg8 gg8Var) {
        this.u0 = gg8Var;
        this.X = LayoutInflater.from(gg8Var.s0);
        int i = qsb.mediaRouteDefaultIconDrawable;
        Context context = gg8Var.s0;
        this.Y = lh8.e(context, i);
        this.Z = lh8.e(context, qsb.mediaRouteTvIconDrawable);
        this.s0 = lh8.e(context, qsb.mediaRouteSpeakerIconDrawable);
        this.t0 = lh8.e(context, qsb.mediaRouteSpeakerGroupIconDrawable);
        C();
    }

    public final void C() {
        ArrayList arrayList = this.o;
        arrayList.clear();
        gg8 gg8Var = this.u0;
        arrayList.add(new dg8(gg8Var.s0.getString(n1c.mr_chooser_title)));
        Iterator it = gg8Var.u0.iterator();
        while (it.hasNext()) {
            arrayList.add(new dg8((dh8) it.next()));
        }
        m();
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.o.size();
    }

    @Override // defpackage.hdc
    public final int l(int i) {
        return ((dg8) this.o.get(i)).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    @Override // defpackage.hdc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(defpackage.dec r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.l(r7)
            java.util.ArrayList r5 = r5.o
            java.lang.Object r5 = r5.get(r7)
            dg8 r5 = (defpackage.dg8) r5
            r7 = 1
            if (r0 == r7) goto L74
            r1 = 2
            if (r0 == r1) goto L14
            goto L81
        L14:
            eg8 r6 = (defpackage.eg8) r6
            java.lang.Object r5 = r5.a
            dh8 r5 = (defpackage.dh8) r5
            r0 = 0
            android.view.View r2 = r6.F0
            r2.setVisibility(r0)
            android.widget.ProgressBar r0 = r6.H0
            r3 = 4
            r0.setVisibility(r3)
            hq r0 = new hq
            r0.<init>(r6, r5)
            r2.setOnClickListener(r0)
            java.lang.String r0 = r5.d
            android.widget.TextView r2 = r6.I0
            r2.setText(r0)
            fg8 r0 = r6.J0
            r0.getClass()
            android.net.Uri r2 = r5.f
            if (r2 == 0) goto L55
            gg8 r3 = r0.u0     // Catch: java.io.IOException -> L52
            android.content.Context r3 = r3.s0     // Catch: java.io.IOException -> L52
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.io.IOException -> L52
            java.io.InputStream r3 = r3.openInputStream(r2)     // Catch: java.io.IOException -> L52
            r4 = 0
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r3, r4)     // Catch: java.io.IOException -> L52
            if (r2 == 0) goto L55
            goto L6e
        L52:
            r2.toString()
        L55:
            int r2 = r5.m
            if (r2 == r7) goto L6b
            if (r2 == r1) goto L68
            boolean r5 = r5.e()
            if (r5 == 0) goto L65
            android.graphics.drawable.Drawable r5 = r0.t0
        L63:
            r2 = r5
            goto L6e
        L65:
            android.graphics.drawable.Drawable r5 = r0.Y
            goto L63
        L68:
            android.graphics.drawable.Drawable r5 = r0.s0
            goto L63
        L6b:
            android.graphics.drawable.Drawable r5 = r0.Z
            goto L63
        L6e:
            android.widget.ImageView r5 = r6.G0
            r5.setImageDrawable(r2)
            goto L81
        L74:
            cg8 r6 = (defpackage.cg8) r6
            java.lang.Object r5 = r5.a
            java.lang.String r5 = r5.toString()
            android.widget.TextView r6 = r6.F0
            r6.setText(r5)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg8.r(dec, int):void");
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.X;
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return new eg8(this, layoutInflater.inflate(syb.mr_picker_route_item, viewGroup, false));
        }
        View viewInflate = layoutInflater.inflate(syb.mr_picker_header_item, viewGroup, false);
        cg8 cg8Var = new cg8(viewInflate);
        cg8Var.F0 = (TextView) viewInflate.findViewById(dvb.mr_picker_header_name);
        return cg8Var;
    }
}

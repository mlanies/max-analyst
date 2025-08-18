package ru.ok.tamtam.animoji.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.bk;
import defpackage.dk;
import defpackage.kpa;
import defpackage.l;
import defpackage.m56;
import defpackage.qh;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/animoji/views/AnimojiTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "value", "getAnimojiEnabled", "()Z", "setAnimojiEnabled", "(Z)V", "animojiEnabled", "animoji_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"WrongCall"})
/* loaded from: classes2.dex */
public class AnimojiTextView extends AppCompatTextView {
    public final dk u0;
    public kpa v0;

    public AnimojiTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void j(AnimojiTextView animojiTextView, CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public static void k(AnimojiTextView animojiTextView, Canvas canvas) {
        super.onDraw(canvas);
    }

    public final boolean getAnimojiEnabled() {
        dk dkVar = this.u0;
        if (dkVar != null) {
            return dkVar.b;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        dk dkVar = this.u0;
        if (dkVar != null) {
            boolean z = qh.b;
            if (z) {
                qh.a.getClass();
            }
            ((m56) dkVar.Y).invoke(canvas);
            if (z) {
                qh.a.getClass();
            }
        }
    }

    public final void setAnimojiEnabled(boolean z) {
        dk dkVar = this.u0;
        if (dkVar != null) {
            dkVar.b = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setText(java.lang.CharSequence r8, android.widget.TextView.BufferType r9) {
        /*
            r7 = this;
            dk r0 = r7.u0
            if (r0 != 0) goto L10
            super.setText(r8, r9)
            kpa r0 = new kpa
            r0.<init>(r8, r9)
            r7.v0 = r0
            goto Lca
        L10:
            java.lang.Object r7 = r0.X
            a66 r7 = (defpackage.a66) r7
            if (r8 == 0) goto Lc7
            boolean r1 = defpackage.w9e.C0(r8)
            if (r1 == 0) goto L1e
            goto Lc7
        L1e:
            boolean r1 = r0.b
            if (r1 != 0) goto L24
            goto Lc7
        L24:
            fj r1 = defpackage.qh.c
            int r2 = r8.length()
            r3 = 0
            r4 = 0
            boolean r5 = r8 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L34
            r5 = r8
            android.text.Spanned r5 = (android.text.Spanned) r5     // Catch: java.lang.Throwable -> L3e
            goto L35
        L34:
            r5 = r4
        L35:
            if (r5 == 0) goto L3e
            java.lang.Class<c4f> r6 = defpackage.c4f.class
            java.lang.Object[] r2 = r5.getSpans(r3, r2, r6)     // Catch: java.lang.Throwable -> L3e
            goto L3f
        L3e:
            r2 = r4
        L3f:
            if (r2 == 0) goto L47
            int r2 = r2.length
            if (r2 != 0) goto L45
            goto L47
        L45:
            r2 = r8
            goto L5c
        L47:
            vw4 r2 = defpackage.vw4.a()     // Catch: java.lang.Throwable -> L50
            java.lang.CharSequence r2 = r2.h(r8)     // Catch: java.lang.Throwable -> L50
            goto L57
        L50:
            r2 = move-exception
            njc r5 = new njc
            r5.<init>(r2)
            r2 = r5
        L57:
            boolean r5 = r2 instanceof defpackage.njc
            if (r5 == 0) goto L5c
            goto L45
        L5c:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 != 0) goto L64
            r7.invoke(r8, r9)
            goto Lca
        L64:
            java.util.List r8 = r1.a(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
            boolean r5 = r8.hasNext()
            if (r5 != 0) goto Lbf
            boolean r8 = r2 instanceof android.text.Spannable
            if (r8 != 0) goto L7c
            goto Lbb
        L7c:
            java.lang.Object r8 = r0.o
            android.view.View r8 = (android.view.View) r8
            boolean r4 = r8 instanceof defpackage.ww4
            if (r4 == 0) goto L90
            r4 = r8
            ww4 r4 = (defpackage.ww4) r4
            boolean r5 = r4.a()
            if (r5 == 0) goto L90
            r4.setEmojiCompatEnabled(r3)
        L90:
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ 1
            r0.c = r3
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto Lb0
            java.lang.Object r3 = r0.Z
            hj r3 = (defpackage.hj) r3
            if (r3 != 0) goto Lb0
            hj r3 = new hj
            r3.<init>(r8)
            r0.Z = r3
            r3.a()
        Lb0:
            r8 = r2
            android.text.Spannable r8 = (android.text.Spannable) r8
            fj r0 = defpackage.qh.c
            defpackage.fp3.c(r8, r1, r0)
            defpackage.fp3.D(r2)
        Lbb:
            r7.invoke(r2, r9)
            goto Lca
        Lbf:
            java.lang.Object r7 = r8.next()
            defpackage.au1.r(r7)
            throw r4
        Lc7:
            r7.invoke(r8, r9)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.animoji.views.AnimojiTextView.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void");
    }

    public AnimojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u0 = new dk(this, new bk(0, this), new l(9, this));
        kpa kpaVar = this.v0;
        if (kpaVar != null) {
            setText((CharSequence) kpaVar.a, (TextView.BufferType) kpaVar.b);
        }
        this.v0 = null;
    }
}

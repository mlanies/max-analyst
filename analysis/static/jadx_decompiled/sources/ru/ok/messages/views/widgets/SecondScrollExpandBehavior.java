package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import defpackage.fm;
import defpackage.hn9;
import defpackage.zmf;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/messages/views/widgets/SecondScrollExpandBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SecondScrollExpandBehavior extends AppBarLayout$Behavior {
    public boolean o;
    public int p;

    public SecondScrollExpandBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    /* renamed from: E */
    public final void o(CoordinatorLayout coordinatorLayout, fm fmVar, View view, int i, int i2, int[] iArr, int i3) {
        super.o(coordinatorLayout, fmVar, view, i, i2, iArr, i3);
        N(i2, fmVar, view, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, defpackage.ow3
    /* renamed from: F */
    public final void p(CoordinatorLayout coordinatorLayout, fm fmVar, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        super.p(coordinatorLayout, fmVar, view, i, i2, i3, i4, i5, iArr);
        N(i2, fmVar, view, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, defpackage.ow3
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(androidx.coordinatorlayout.widget.CoordinatorLayout r5, defpackage.fm r6, android.view.View r7, android.view.View r8, int r9, int r10) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r9 != r1) goto L5
            return r0
        L5:
            if (r10 != r1) goto L16
            int r2 = r4.p
            int r3 = r4.x()
            if (r2 != r3) goto L16
            int r2 = r4.x()
            if (r2 == 0) goto L16
            goto L33
        L16:
            boolean r2 = r8 instanceof defpackage.ixc
            if (r2 != 0) goto L1b
            goto L33
        L1b:
            boolean r2 = r8 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 == 0) goto L32
            r2 = r8
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.a r2 = r2.getLayoutManager()
            boolean r3 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r3 == 0) goto L32
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            int r2 = r2.T0()
            if (r2 != 0) goto L33
        L32:
            r0 = r1
        L33:
            r4.o = r0
            int r0 = r4.x()
            r4.p = r0
            boolean r4 = super.u(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.widgets.SecondScrollExpandBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, fm, android.view.View, android.view.View, int, int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(int i, fm fmVar, View view, int i2) {
        if (i2 == 1) {
            int iX = x();
            if ((i >= 0 || iX != this.p) && ((i <= 0 || iX != (-fmVar.getTotalScrollRange())) && (i >= 0 || iX != 0))) {
                return;
            }
            WeakHashMap weakHashMap = zmf.a;
            if (view instanceof hn9) {
                ((hn9) view).a(1);
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, defpackage.ow3
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        fm fmVar = (fm) view;
        super.o(coordinatorLayout, fmVar, view2, i, i2, iArr, i3);
        N(i2, fmVar, view2, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, defpackage.ow3
    public final void v(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        super.v(coordinatorLayout, (fm) view, view2, i);
    }

    @Override // defpackage.bof
    public final boolean z(int i) {
        if (this.o) {
            return super.z(i);
        }
        return false;
    }
}

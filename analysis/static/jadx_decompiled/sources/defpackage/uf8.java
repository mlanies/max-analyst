package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.mediarouter.app.OverlayListView;
import androidx.mediarouter.app.a;
import androidx.mediarouter.app.c;
import androidx.mediarouter.app.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class uf8 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d b;

    public uf8(d dVar, boolean z) {
        this.b = dVar;
        this.a = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iL;
        HashMap map;
        HashMap map2;
        Bitmap bitmap;
        d dVar = this.b;
        dVar.D0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (dVar.p1) {
            dVar.q1 = true;
            return;
        }
        int i = dVar.K0.getLayoutParams().height;
        d.o(dVar.K0, -1);
        dVar.u(dVar.i());
        View decorView = dVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWindow().getAttributes().width, 1073741824), 0);
        d.o(dVar.K0, i);
        if (!(dVar.E0.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) dVar.E0.getDrawable()).getBitmap()) == null) {
            iL = 0;
        } else {
            iL = dVar.l(bitmap.getWidth(), bitmap.getHeight());
            dVar.E0.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int iM = dVar.m(dVar.i());
        int size = dVar.Q0.size();
        boolean zN = dVar.n();
        dh8 dh8Var = dVar.t0;
        int size2 = zN ? Collections.unmodifiableList(dh8Var.u).size() * dVar.Y0 : 0;
        if (size > 0) {
            size2 += dVar.a1;
        }
        int iMin = Math.min(size2, dVar.Z0);
        if (!dVar.o1) {
            iMin = 0;
        }
        int iMax = Math.max(iL, iMin) + iM;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height() - (dVar.C0.getMeasuredHeight() - dVar.D0.getMeasuredHeight());
        if (iL <= 0 || iMax > iHeight) {
            if (dVar.K0.getMeasuredHeight() + dVar.O0.getLayoutParams().height >= dVar.D0.getMeasuredHeight()) {
                dVar.E0.setVisibility(8);
            }
            iMax = iMin + iM;
            iL = 0;
        } else {
            dVar.E0.setVisibility(0);
            d.o(dVar.E0, iL);
        }
        if (!dVar.i() || iMax > iHeight) {
            dVar.L0.setVisibility(8);
        } else {
            dVar.L0.setVisibility(0);
        }
        dVar.u(dVar.L0.getVisibility() == 0);
        int iM2 = dVar.m(dVar.L0.getVisibility() == 0);
        int iMax2 = Math.max(iL, iMin) + iM2;
        if (iMax2 > iHeight) {
            iMin -= iMax2 - iHeight;
        } else {
            iHeight = iMax2;
        }
        dVar.K0.clearAnimation();
        dVar.O0.clearAnimation();
        dVar.D0.clearAnimation();
        boolean z = this.a;
        if (z) {
            dVar.h(dVar.K0, iM2);
            dVar.h(dVar.O0, iMin);
            dVar.h(dVar.D0, iHeight);
        } else {
            d.o(dVar.K0, iM2);
            d.o(dVar.O0, iMin);
            d.o(dVar.D0, iHeight);
        }
        d.o(dVar.B0, rect.height());
        List listUnmodifiableList = Collections.unmodifiableList(dh8Var.u);
        if (listUnmodifiableList.isEmpty()) {
            dVar.Q0.clear();
            dVar.P0.notifyDataSetChanged();
            return;
        }
        if (new HashSet(dVar.Q0).equals(new HashSet(listUnmodifiableList))) {
            dVar.P0.notifyDataSetChanged();
            return;
        }
        if (z) {
            OverlayListView overlayListView = dVar.O0;
            c cVar = dVar.P0;
            map = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i2 = 0; i2 < overlayListView.getChildCount(); i2++) {
                Object item = cVar.getItem(firstVisiblePosition + i2);
                View childAt = overlayListView.getChildAt(i2);
                map.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            map = null;
        }
        if (z) {
            OverlayListView overlayListView2 = dVar.O0;
            c cVar2 = dVar.P0;
            map2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i3 = 0; i3 < overlayListView2.getChildCount(); i3++) {
                Object item2 = cVar2.getItem(firstVisiblePosition2 + i3);
                View childAt2 = overlayListView2.getChildAt(i3);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(bitmapCreateBitmap));
                map2.put(item2, new BitmapDrawable(dVar.u0.getResources(), bitmapCreateBitmap));
            }
        } else {
            map2 = null;
        }
        ArrayList arrayList = dVar.Q0;
        HashSet hashSet = new HashSet(listUnmodifiableList);
        hashSet.removeAll(arrayList);
        dVar.R0 = hashSet;
        HashSet hashSet2 = new HashSet(dVar.Q0);
        hashSet2.removeAll(listUnmodifiableList);
        dVar.S0 = hashSet2;
        dVar.Q0.addAll(0, dVar.R0);
        dVar.Q0.removeAll(dVar.S0);
        dVar.P0.notifyDataSetChanged();
        if (z && dVar.o1) {
            if (dVar.S0.size() + dVar.R0.size() > 0) {
                dVar.O0.setEnabled(false);
                dVar.O0.requestLayout();
                dVar.p1 = true;
                dVar.O0.getViewTreeObserver().addOnGlobalLayoutListener(new a(dVar, map, map2));
                return;
            }
        }
        dVar.R0 = null;
        dVar.S0 = null;
    }
}

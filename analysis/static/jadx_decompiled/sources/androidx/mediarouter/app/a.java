package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import defpackage.coa;
import defpackage.dh8;
import defpackage.h7b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ d c;

    public a(d dVar, HashMap map, HashMap map2) {
        this.c = dVar;
        this.a = map;
        this.b = map2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        coa coaVar;
        dh8 dh8Var;
        d dVar = this.c;
        dVar.O0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = dVar.R0;
        if (hashSet == null || dVar.S0 == null) {
            return;
        }
        int size = hashSet.size() - dVar.S0.size();
        b bVar = new b(dVar);
        int firstVisiblePosition = dVar.O0.getFirstVisiblePosition();
        int i = 0;
        boolean z = false;
        while (true) {
            int childCount = dVar.O0.getChildCount();
            map = this.a;
            map2 = this.b;
            if (i >= childCount) {
                break;
            }
            View childAt = dVar.O0.getChildAt(i);
            dh8 dh8Var2 = (dh8) dVar.P0.getItem(firstVisiblePosition + i);
            Rect rect = (Rect) map.get(dh8Var2);
            int top = childAt.getTop();
            int i2 = rect != null ? rect.top : (dVar.Y0 * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = dVar.R0;
            if (hashSet2 == null || !hashSet2.contains(dh8Var2)) {
                dh8Var = dh8Var2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                dh8Var = dh8Var2;
                alphaAnimation.setDuration(dVar.s1);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i2 - top, 0.0f);
            translateAnimation.setDuration(dVar.r1);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(dVar.u1);
            if (!z) {
                animationSet.setAnimationListener(bVar);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            dh8 dh8Var3 = dh8Var;
            map.remove(dh8Var3);
            map2.remove(dh8Var3);
            i++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            dh8 dh8Var4 = (dh8) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(dh8Var4);
            if (dVar.S0.contains(dh8Var4)) {
                coaVar = new coa(bitmapDrawable, rect2);
                coaVar.h = 1.0f;
                coaVar.i = 0.0f;
                coaVar.e = dVar.t1;
                coaVar.d = dVar.u1;
            } else {
                int i3 = dVar.Y0 * size;
                coa coaVar2 = new coa(bitmapDrawable, rect2);
                coaVar2.g = i3;
                coaVar2.e = dVar.r1;
                coaVar2.d = dVar.u1;
                coaVar2.m = new h7b(dVar, 24, dh8Var4);
                dVar.T0.add(dh8Var4);
                coaVar = coaVar2;
            }
            dVar.O0.a.add(coaVar);
        }
    }
}

package defpackage;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class h6g extends WindowInsetsAnimation$Callback {
    public final q42 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public h6g(q42 q42Var) {
        super(q42Var.a);
        this.d = new HashMap();
        this.a = q42Var;
    }

    public final k6g a(WindowInsetsAnimation windowInsetsAnimation) {
        k6g k6gVar = (k6g) this.d.get(windowInsetsAnimation);
        if (k6gVar == null) {
            k6gVar = new k6g(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                k6gVar.a = new i6g(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, k6gVar);
        }
        return k6gVar;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationL = voa.l(list.get(size));
            k6g k6gVarA = a(windowInsetsAnimationL);
            k6gVarA.a.d(windowInsetsAnimationL.getFraction());
            this.c.add(k6gVarA);
        }
        return this.a.d(x6g.f(null, windowInsets), this.b).e();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        l7b l7bVarE = this.a.e(a(windowInsetsAnimation), new l7b(bounds));
        l7bVarE.getClass();
        voa.p();
        return voa.j(((v27) l7bVarE.b).d(), ((v27) l7bVarE.c).d());
    }
}

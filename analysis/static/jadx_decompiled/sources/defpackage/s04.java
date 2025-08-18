package defpackage;

import android.accounts.Account;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class s04 {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        TabLayout tabLayout = (TabLayout) this.d;
        mg6 mg6Var = new mg6(tabLayout, 1);
        ViewPager2 viewPager2 = (ViewPager2) this.e;
        viewPager2.b(mg6Var);
        this.h = mg6Var;
        r04 r04Var = new r04(viewPager2, this.a, this.b);
        tabLayout.a(r04Var);
        this.i = r04Var;
        tabLayout.q(viewPager2.getCurrentItem(), 0.0f, true, true, true);
        k56 k56Var = (k56) this.f;
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    public GoogleSignInOptions b() {
        Scope scope = GoogleSignInOptions.y0;
        HashSet hashSet = (HashSet) this.d;
        if (hashSet.contains(scope)) {
            Scope scope2 = GoogleSignInOptions.x0;
            if (hashSet.contains(scope2)) {
                hashSet.remove(scope2);
            }
        }
        if (this.c && (((Account) this.f) == null || !hashSet.isEmpty())) {
            ((HashSet) this.d).add(GoogleSignInOptions.w0);
        }
        return new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) this.f, this.c, this.a, this.b, (String) this.e, (String) this.g, (HashMap) this.h, (String) this.i);
    }

    public void c() {
        if (this.c) {
            r04 r04Var = (r04) this.i;
            if (r04Var != null) {
                ((TabLayout) this.d).l(r04Var);
            }
            this.i = null;
            mg6 mg6Var = (mg6) this.h;
            if (mg6Var != null) {
                ((ViewPager2) this.e).g(mg6Var);
            }
            this.h = null;
            this.c = false;
            k56 k56Var = (k56) this.g;
            if (k56Var != null) {
                k56Var.invoke();
            }
        }
    }
}

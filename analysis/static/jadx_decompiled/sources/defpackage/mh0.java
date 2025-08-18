package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* loaded from: classes.dex */
public final class mh0 extends hqd {
    public final kh0 F0;
    public final xq3 G0;

    public mh0(Context context, wq3 wq3Var) {
        kh0 kh0Var = (kh0) dh0.a.getAccessor().c(kh0.class);
        ViewPager2 viewPager2 = new ViewPager2(context);
        fm9.z(viewPager2);
        super(viewPager2);
        this.F0 = kh0Var;
        xq3 xq3Var = new xq3(wq3Var);
        this.G0 = xq3Var;
        viewPager2.setId(t5a.a);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        viewPager2.setAdapter(xq3Var);
        viewPager2.setOrientation(0);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setPageTransformer(new f9(viewPager2, 2, this));
        viewPager2.b(new lh0(0, this));
    }

    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(ch0 ch0Var) {
        b bVar = new b(14, this);
        List list = ch0Var.b;
        this.G0.F(list, bVar);
        ViewPager2 viewPager2 = (ViewPager2) this.a;
        viewPager2.setUserInputEnabled(list.size() > 1);
        if (list.size() == 1 && ((yq3) list.get(0)).a == 1) {
            viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
    }
}

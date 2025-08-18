package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class oof implements u4, pg4 {
    public final /* synthetic */ Object a;

    public /* synthetic */ oof(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.u4
    public boolean b(View view) {
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) ((m5d) this.a).X;
        if (viewPager2.F0) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.pg4
    public Map getRemoteVideoRenderers(bg1 bg1Var) {
        pg4 pg4Var = ((py0) this.a).v1;
        return pg4Var != null ? pg4Var.getRemoteVideoRenderers(bg1Var) : Collections.emptyMap();
    }

    @Override // defpackage.pg4
    public boolean isEnabled() {
        return ((py0) this.a).v1 != null;
    }
}

package defpackage;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes.dex */
public final class cx5 implements cje {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cx5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bje
    public final void a(eje ejeVar) {
        y5a tabItem;
        Object obj;
        String str = null;
        switch (this.a) {
            case 0:
                View view = ejeVar.e;
                vja vjaVar = view instanceof vja ? (vja) view : null;
                if (vjaVar != null && (tabItem = vjaVar.getTabItem()) != null) {
                    str = tabItem.a;
                }
                ((x30) this.b).u0 = str;
                return;
            case 1:
                int i = 0;
                if (ejeVar.d > 0) {
                    NeuroAvatarsScreen neuroAvatarsScreen = (NeuroAvatarsScreen) this.b;
                    bc7[] bc7VarArr = NeuroAvatarsScreen.M0;
                    neuroAvatarsScreen.m0().setExpanded(false);
                }
                NeuroAvatarsScreen neuroAvatarsScreen2 = (NeuroAvatarsScreen) this.b;
                bc7[] bc7VarArr2 = NeuroAvatarsScreen.M0;
                wp9 wp9VarR0 = neuroAvatarsScreen2.r0();
                int i2 = ejeVar.d;
                if (i2 == wp9VarR0.Y) {
                    return;
                }
                Set setKeySet = ((Map) wp9VarR0.y0.getValue()).keySet();
                boolean z = setKeySet instanceof List;
                if (z) {
                    obj = ((List) setKeySet).get(i2);
                } else {
                    e63 e63Var = new e63(i2);
                    if (!z) {
                        if (i2 < 0) {
                            e63Var.invoke(Integer.valueOf(i2));
                            throw null;
                        }
                        int i3 = 0;
                        for (Object obj2 : setKeySet) {
                            int i4 = i3 + 1;
                            if (i2 == i3) {
                                obj = obj2;
                            } else {
                                i3 = i4;
                            }
                        }
                        e63Var.invoke(Integer.valueOf(i2));
                        throw null;
                    }
                    List list = (List) setKeySet;
                    if (i2 < 0 || i2 >= list.size()) {
                        e63Var.invoke(Integer.valueOf(i2));
                        throw null;
                    }
                    obj = list.get(i2);
                }
                int iIntValue = ((Number) obj).intValue();
                Iterator it = ((List) wp9VarR0.X.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (((qo9) it.next()).c != iIntValue) {
                        i++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i);
                wp9VarR0.Y = i2;
                wp9VarR0.v0.g(new ro9(i2, numValueOf));
                return;
            case 2:
                ((ViewPager) this.b).setCurrentItem(ejeVar.d);
                return;
            default:
                ((ViewPager2) this.b).e(ejeVar.d, true);
                return;
        }
    }
}

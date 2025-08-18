package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class g04 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g04(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.a) {
            case 0:
                h04 h04Var = (h04) this.b;
                h04Var.a = true;
                h04Var.notifyDataSetChanged();
                break;
            case 1:
                wl7 wl7Var = (wl7) this.b;
                if (wl7Var.K0.isShowing()) {
                    wl7Var.f();
                    break;
                }
                break;
            case 2:
                ((TabLayout) this.b).j();
                break;
            default:
                ((ViewPager) this.b).f();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.a) {
            case 0:
                h04 h04Var = (h04) this.b;
                h04Var.a = false;
                h04Var.notifyDataSetInvalidated();
                break;
            case 1:
                ((wl7) this.b).dismiss();
                break;
            case 2:
                ((TabLayout) this.b).j();
                break;
            default:
                ((ViewPager) this.b).f();
                break;
        }
    }
}

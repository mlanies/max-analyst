package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class ri2 implements k56 {
    public final /* synthetic */ ChatMediaViewerScreen a;
    public final /* synthetic */ int b;
    public final /* synthetic */ cj2 c;

    public ri2(ChatMediaViewerScreen chatMediaViewerScreen, int i, cj2 cj2Var) {
        this.a = chatMediaViewerScreen;
        this.b = i;
        this.c = cj2Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        String name = this.a.getClass().getName();
        cj2 cj2Var = this.c;
        int i = this.b;
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            int i2 = cj2Var.b;
            int iJ = chatMediaViewerScreen.D0.j();
            int size = cj2Var.a.size();
            StringBuilder sbJ = wg0.j("Media viewer. Pager, after submitList \n                        |initPos:", i2, ", \n                        |prevItemsA:", i, ", \n                        |itemsA:");
            sbJ.append(iJ);
            sbJ.append(", \n                        |items:");
            sbJ.append(size);
            ir6Var.d(us7Var, name, x9e.c0(sbJ.toString()), null);
        }
        if (this.b == 0 && (!this.c.a.isEmpty()) && this.c.b >= 0) {
            ChatMediaViewerScreen chatMediaViewerScreen2 = this.a;
            chatMediaViewerScreen2.getClass();
            ((ViewPager2) chatMediaViewerScreen2.x0.T0(chatMediaViewerScreen2, ChatMediaViewerScreen.K0[5])).e(this.c.b, false);
        }
        return e5f.a;
    }
}

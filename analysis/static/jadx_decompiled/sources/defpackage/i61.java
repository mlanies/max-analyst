package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.Iterator;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class i61 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i61(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                Iterator it = ((CallEventsWidget) obj).o.iterator();
                while (it.hasNext()) {
                    ((fi1) it.next()).a.z0.c();
                }
                break;
            case 1:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                carouselLayoutManager.getClass();
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new cu1(10, carouselLayoutManager));
                    break;
                }
            case 2:
                bc7[] bc7VarArr = ChatScreen.k1;
                ChatScreen chatScreen = (ChatScreen) obj;
                if (chatScreen.getView() != null) {
                    int measuredHeight = view.getMeasuredHeight() - view.getPaddingBottom();
                    ViewGroup.LayoutParams layoutParams = chatScreen.L0().getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (measuredHeight != (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)) {
                        ((ViewGroup.MarginLayoutParams) chatScreen.L0().getLayoutParams()).bottomMargin = Math.max(measuredHeight, tu0.G(48 * fk4.d().getDisplayMetrics().density));
                    }
                    if (measuredHeight != chatScreen.O0().getPaddingBottom()) {
                        ViewGroup.LayoutParams layoutParams2 = chatScreen.O0().getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                        if (marginLayoutParams2 != null) {
                            marginLayoutParams2.bottomMargin = measuredHeight;
                        }
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    bc7[] bc7VarArr2 = ChatScreen.k1;
                    bc7 bc7Var = bc7VarArr2[15];
                    q7c q7cVar = chatScreen.V0;
                    if (measuredHeight2 != ((LinearLayout) q7cVar.T0(chatScreen, bc7Var)).getPaddingBottom()) {
                        LinearLayout linearLayout = (LinearLayout) q7cVar.T0(chatScreen, bc7VarArr2[15]);
                        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), view.getMeasuredHeight());
                        break;
                    }
                }
                break;
            case 3:
                bc7[] bc7VarArr3 = MediaBarWidget.d1;
                MediaBarWidget mediaBarWidget = (MediaBarWidget) obj;
                mediaBarWidget.getClass();
                bc7 bc7Var2 = MediaBarWidget.d1[7];
                w12 w12Var = (w12) mediaBarWidget.y0.getValue();
                w12Var.setPadding(w12Var.getPaddingLeft(), w12Var.getPaddingTop(), w12Var.getPaddingRight(), i4 - i2);
                break;
            default:
                q8b q8bVar = (q8b) obj;
                q8bVar.getClass();
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    q8bVar.b();
                    q8bVar.a(true);
                    break;
                }
                break;
        }
    }
}

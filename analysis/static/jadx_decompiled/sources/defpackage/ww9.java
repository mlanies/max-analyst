package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ww9 implements m56 {
    public final /* synthetic */ int a;

    public /* synthetic */ ww9() {
        this.a = 8;
        vmc vmcVar = vmc.a;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        int i = 26;
        pq9 pq9Var = qp4.u0;
        int i2 = 3;
        int i3 = 4;
        Continuation continuation = null;
        e5f e5fVar = e5f.a;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = NotificationsSettingsScreen.v0;
                sv9.c.P1().d();
                return e5fVar;
            case 1:
                int i4 = OneMeApplication.s0;
                return Boolean.FALSE;
            case 2:
                l38 l38Var = (l38) obj;
                int i5 = OneMeApplication.s0;
                return "    " + l38Var.a + ": executing=" + l38Var.o.toMillis(l38Var.c) + "ms";
            case 3:
                l38 l38Var2 = (l38) obj;
                int i6 = OneMeApplication.s0;
                return "    " + l38Var2.a + ": waiting=" + l38Var2.o.toMillis(l38Var2.b) + "ms";
            case 4:
                l38 l38Var3 = (l38) obj;
                int i7 = OneMeApplication.s0;
                TimeUnit timeUnit = l38Var3.o;
                return "    " + l38Var3.a + ": executing=" + timeUnit.toMillis(l38Var3.c) + "ms, waiting=" + timeUnit.toMillis(l38Var3.b);
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                return Integer.valueOf(iIntValue != 0 ? iIntValue != 1 ? 10 : 15 : 18);
            case 6:
                return bj9.a();
            case 7:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup == null) {
                    return null;
                }
                if (viewGroup.getChildCount() == 0) {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    return new at(7, viewGroup);
                }
                return null;
            case 8:
                View view2 = (View) obj;
                if (view2 instanceof ViewGroup) {
                    ((ViewGroup) view2).setOnHierarchyChangeListener(vmc.a);
                }
                return Boolean.TRUE;
            case 9:
                bc7[] bc7VarArr2 = iba.p;
                return e5fVar;
            case 10:
                return Integer.valueOf(((fka) obj).getText().j);
            case 11:
                return Integer.valueOf(26 - ((((Integer) obj).intValue() + 1) * 4));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return Integer.valueOf(((fka) obj).getText().j);
            case 13:
                return ((jl3) obj).a();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bc7[] bc7VarArr3 = OtherNotificationsSettingsScreen.Y;
                sv9.c.P1().d();
                return e5fVar;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return ((nl2) obj).C0;
            case 16:
                bc7[] bc7VarArr4 = PickerChatsTabWidget.y0;
                return Boolean.FALSE;
            case LangUtils.HASH_SEED /* 17 */:
                ((Integer) obj).getClass();
                bc7[] bc7VarArr5 = PickerContactsListWidget.y0;
                return Boolean.FALSE;
            case 18:
                return r0e.a(null);
            case 19:
                kpa kpaVar = (kpa) obj;
                return new uab(((Long) kpaVar.a).longValue(), Collections.singletonList((String) kpaVar.b));
            case 20:
                bc7[] bc7VarArr6 = ProfileInviteScreen.Y;
                ckb.c.f2();
                return e5fVar;
            case 21:
                return Integer.valueOf(((fka) obj).getText().g);
            case 22:
                fka fkaVar = (fka) obj;
                bc7[] bc7VarArr7 = ProfileScreen.D0;
                fkaVar.getIcon();
                return new dcf(-1, fkaVar.getIcon().k);
            case 23:
                Toolbar toolbar = (Toolbar) obj;
                bc7[] bc7VarArr8 = ProfileScreen.D0;
                cla claVar = new cla(toolbar.getContext(), 6);
                claVar.setId(wea.k1);
                claVar.setForm(uka.a);
                claVar.setTextShimmerEnabled(false);
                claVar.setLeftActions(new kka(new ww9(i)));
                float f = 6;
                claVar.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), claVar.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), claVar.getPaddingBottom());
                toolbar.addView(claVar);
                return e5fVar;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                LinearLayout linearLayout = (LinearLayout) obj;
                bc7[] bc7VarArr9 = ProfileScreen.D0;
                View s5aVar = new s5a(linearLayout.getContext());
                s5aVar.setId(wea.e1);
                float f2 = 96;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 1;
                layoutParams.topMargin = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                s5aVar.setLayoutParams(layoutParams);
                linearLayout.addView(s5aVar);
                TextView textView = new TextView(linearLayout.getContext());
                textView.setId(wea.i1);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                float f3 = 20;
                layoutParams2.leftMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                layoutParams2.rightMargin = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
                layoutParams2.topMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                layoutParams2.gravity = 1;
                textView.setLayoutParams(layoutParams2);
                textView.setMaxLines(3);
                textView.setGravity(1);
                i4f.y.b(textView, du4.b);
                textView.setTextColor(pq9Var.j(textView).getText().e);
                linearLayout.addView(textView);
                ww9 ww9Var = new ww9(25);
                LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                float f4 = 12;
                linearLayout2.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(4 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density), linearLayout2.getPaddingBottom());
                linearLayout2.setOrientation(0);
                linearLayout2.setBackground(null);
                linearLayout2.setGravity(1);
                ww9Var.invoke(linearLayout2);
                linearLayout.addView(linearLayout2);
                return e5fVar;
            case 25:
                LinearLayout linearLayout3 = (LinearLayout) obj;
                bc7[] bc7VarArr10 = ProfileScreen.D0;
                AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout3.getContext(), null);
                appCompatTextView.setId(wea.U);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                float f5 = 20;
                layoutParams3.leftMargin = tu0.G(fk4.d().getDisplayMetrics().density * f5);
                appCompatTextView.setLayoutParams(layoutParams3);
                appCompatTextView.setGravity(1);
                kqe kqeVar = i4f.n;
                kqeVar.b(appCompatTextView, du4.b);
                v3c.y(new mb5(i2, continuation, 5), appCompatTextView);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setMaxLines(1);
                linearLayout3.addView(appCompatTextView);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout3.getContext(), null);
                appCompatTextView2.setId(wea.E);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                float f6 = 4;
                layoutParams4.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f6));
                layoutParams4.setMarginEnd(tu0.G(f6 * fk4.d().getDisplayMetrics().density));
                appCompatTextView2.setLayoutParams(layoutParams4);
                appCompatTextView2.setText("·");
                appCompatTextView2.setGravity(1);
                kqeVar.b(appCompatTextView2, du4.b);
                v3c.y(new mb5(i2, continuation, i3), appCompatTextView2);
                linearLayout3.addView(appCompatTextView2);
                TextView textView2 = new TextView(linearLayout3.getContext());
                textView2.setId(wea.h1);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.rightMargin = tu0.G(f5 * fk4.d().getDisplayMetrics().density);
                textView2.setLayoutParams(layoutParams5);
                textView2.setGravity(1);
                i4f.p.b(textView2, du4.b);
                textView2.setTextColor(pq9Var.j(textView2).getText().g);
                linearLayout3.addView(textView2);
                return e5fVar;
            case 26:
                bc7[] bc7VarArr11 = ProfileScreen.D0;
                ckb.c.f2();
                return e5fVar;
            case 27:
                fka fkaVar2 = (fka) obj;
                bc7[] bc7VarArr12 = ProfileScreen.D0;
                fkaVar2.getIcon();
                return new dcf(-1, fkaVar2.getIcon().k);
            case 28:
                return new b6c((Context) obj);
            default:
                return String.valueOf(obj);
        }
    }

    public /* synthetic */ ww9(int i) {
        this.a = i;
    }
}

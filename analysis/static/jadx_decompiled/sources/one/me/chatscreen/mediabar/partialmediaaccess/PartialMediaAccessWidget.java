package one.me.chatscreen.mediabar.partialmediaaccess;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.bc7;
import defpackage.fua;
import defpackage.hob;
import defpackage.je7;
import defpackage.k56;
import defpackage.nec;
import defpackage.qm0;
import defpackage.z84;
import defpackage.zr6;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/chatscreen/mediabar/partialmediaaccess/PartialMediaAccessWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class PartialMediaAccessWidget extends Widget {
    public static final /* synthetic */ bc7[] o = {new hob(PartialMediaAccessWidget.class, "titleSubtitleContent", "getTitleSubtitleContent()Landroid/widget/LinearLayout;", 0), zr6.e(nec.a, PartialMediaAccessWidget.class, "content", "getContent()Landroid/widget/LinearLayout;", 0)};
    public final je7 a;
    public final qm0 b;
    public final qm0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public PartialMediaAccessWidget() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bc7 bc7Var = o[1];
        return (LinearLayout) this.c.getValue();
    }

    public PartialMediaAccessWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = fua.a.b();
        final int i = 0;
        this.b = binding(new k56(this) { // from class: cqa
            public final /* synthetic */ PartialMediaAccessWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i2 = 2;
                Continuation continuation = null;
                PartialMediaAccessWidget partialMediaAccessWidget = this.b;
                int i3 = 3;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = PartialMediaAccessWidget.o;
                        LinearLayout linearLayout = new LinearLayout(partialMediaAccessWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(0 * fk4.d().getDisplayMetrics().density), -2, 1.0f));
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView.setText(u8a.y);
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), tu0.G(2 * fk4.d().getDisplayMetrics().density));
                        i4f.j.b(appCompatTextView, du4.b);
                        v3c.y(new mb5(i3, continuation, i2), appCompatTextView);
                        linearLayout.addView(appCompatTextView);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView2.setText(u8a.x);
                        i4f.n.b(appCompatTextView2, du4.b);
                        v3c.y(new mb5(i3, continuation, i3), appCompatTextView2);
                        linearLayout.addView(appCompatTextView2);
                        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), tu0.G(12 * fk4.d().getDisplayMetrics().density), linearLayout.getPaddingBottom());
                        return linearLayout;
                    default:
                        bc7[] bc7VarArr2 = PartialMediaAccessWidget.o;
                        LinearLayout linearLayout2 = new LinearLayout(partialMediaAccessWidget.getContext());
                        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        linearLayout2.setVerticalGravity(16);
                        bc7 bc7Var = PartialMediaAccessWidget.o[0];
                        linearLayout2.addView((LinearLayout) partialMediaAccessWidget.b.getValue());
                        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
                        oneMeButton.setText(u8a.w);
                        oneMeButton.setSize(c7a.a);
                        oneMeButton.setMode(b7a.b);
                        oneMeButton.setAppearance(z6a.c);
                        tu0.K(oneMeButton, 300L, new xx5(23, partialMediaAccessWidget));
                        linearLayout2.addView(oneMeButton);
                        float f = 12;
                        float f2 = 4;
                        linearLayout2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                        v3c.y(new o(i3, continuation, 9), linearLayout2);
                        return linearLayout2;
                }
            }
        });
        final int i2 = 1;
        this.c = binding(new k56(this) { // from class: cqa
            public final /* synthetic */ PartialMediaAccessWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i22 = 2;
                Continuation continuation = null;
                PartialMediaAccessWidget partialMediaAccessWidget = this.b;
                int i3 = 3;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = PartialMediaAccessWidget.o;
                        LinearLayout linearLayout = new LinearLayout(partialMediaAccessWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(0 * fk4.d().getDisplayMetrics().density), -2, 1.0f));
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView.setText(u8a.y);
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), tu0.G(2 * fk4.d().getDisplayMetrics().density));
                        i4f.j.b(appCompatTextView, du4.b);
                        v3c.y(new mb5(i3, continuation, i22), appCompatTextView);
                        linearLayout.addView(appCompatTextView);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView2.setText(u8a.x);
                        i4f.n.b(appCompatTextView2, du4.b);
                        v3c.y(new mb5(i3, continuation, i3), appCompatTextView2);
                        linearLayout.addView(appCompatTextView2);
                        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), tu0.G(12 * fk4.d().getDisplayMetrics().density), linearLayout.getPaddingBottom());
                        return linearLayout;
                    default:
                        bc7[] bc7VarArr2 = PartialMediaAccessWidget.o;
                        LinearLayout linearLayout2 = new LinearLayout(partialMediaAccessWidget.getContext());
                        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        linearLayout2.setVerticalGravity(16);
                        bc7 bc7Var = PartialMediaAccessWidget.o[0];
                        linearLayout2.addView((LinearLayout) partialMediaAccessWidget.b.getValue());
                        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
                        oneMeButton.setText(u8a.w);
                        oneMeButton.setSize(c7a.a);
                        oneMeButton.setMode(b7a.b);
                        oneMeButton.setAppearance(z6a.c);
                        tu0.K(oneMeButton, 300L, new xx5(23, partialMediaAccessWidget));
                        linearLayout2.addView(oneMeButton);
                        float f = 12;
                        float f2 = 4;
                        linearLayout2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                        v3c.y(new o(i3, continuation, 9), linearLayout2);
                        return linearLayout2;
                }
            }
        });
    }

    public /* synthetic */ PartialMediaAccessWidget(Bundle bundle, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : bundle);
    }
}

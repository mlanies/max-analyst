package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.InsetDrawable;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.MediaStreamTrack;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class a5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ a5(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return AccountManager.get(this.b);
            case 1:
                return kt3.b(this.b, woc.p0);
            case 2:
                return new InsetDrawable(kt3.b(this.b, woc.L0), tu0.G(8 * fk4.d().getDisplayMetrics().density));
            case 3:
                return new InsetDrawable(kt3.b(this.b, woc.H0), tu0.G(8 * fk4.d().getDisplayMetrics().density));
            case 4:
                return (AudioManager) this.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            case 5:
                return new bme(this.b);
            case 6:
                ca9 ca9Var = new ca9(this.b);
                float f = 28;
                ca9Var.setBounds(0, 0, tu0.G(fk4.c() * f), tu0.G(fk4.c() * f));
                return ca9Var;
            case 7:
                return tpa.u(this.b);
            case 8:
                return tpa.u(this.b);
            case 9:
                ap1 ap1Var = new ap1(this.b, null);
                ap1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ap1Var.setMode(yo1.c);
                ap1Var.setVideoLayoutUpdatesControllerProvider(new k11(24));
                return ap1Var;
            case 10:
                return tpa.u(this.b);
            case 11:
                Space space = new Space(this.b);
                space.setId(View.generateViewId());
                space.setLayoutParams(new ti3(-1, 0));
                return space;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Space space2 = new Space(this.b);
                space2.setId(View.generateViewId());
                space2.setLayoutParams(new ti3(-1, 0));
                return space2;
            case 13:
                return new mcc(this.b);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                knc kncVar = new knc(this.b, null);
                kncVar.setId(y7a.J1);
                kncVar.setMode(fnc.b);
                float f2 = 60;
                kncVar.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                kncVar.setLayoutParams(new ti3(-2, -2));
                kncVar.setButtonPadding(tu0.G(5 * fk4.d().getDisplayMetrics().density));
                kncVar.setVisibility(8);
                return kncVar;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                knc kncVar2 = new knc(this.b, null);
                kncVar2.setId(y7a.I1);
                kncVar2.setMode(fnc.a);
                float f3 = 60;
                kncVar2.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                kncVar2.setLayoutParams(new ti3(-2, -2));
                kncVar2.setButtonPadding(tu0.G(5 * fk4.d().getDisplayMetrics().density));
                kncVar2.setVisibility(8);
                return kncVar2;
            case 16:
                return tpa.u(this.b);
            case LangUtils.HASH_SEED /* 17 */:
                k4c k4cVar = new k4c(this.b);
                float f4 = 60;
                k4cVar.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                return k4cVar;
            case 18:
                TextView textView = new TextView(this.b);
                textView.setId(y7a.F1);
                textView.setGravity(17);
                i4f.x.b(textView, du4.b);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(qp4.u0.p(textView).c.getText().e);
                textView.setVisibility(8);
                textView.setLayoutParams(new ti3(-1, -2));
                return textView;
            case 19:
                TextView textView2 = new TextView(this.b);
                textView2.setId(y7a.G1);
                textView2.setGravity(17);
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                i4f.n.b(textView2, du4.b);
                textView2.setTextColor(qp4.u0.p(textView2).c.getText().h);
                textView2.setVisibility(8);
                textView2.setLayoutParams(new ti3(-1, -2));
                return textView2;
            case 20:
                dm1 dm1Var = new dm1(this.b, null);
                dm1Var.setId(y7a.L1);
                dm1Var.setLayoutParams(new ti3(-1, -2));
                dm1Var.setVisibility(8);
                return dm1Var;
            case 21:
                return kt3.b(this.b, x7a.e0);
            case 22:
                return kt3.b(this.b, x7a.l0);
            case 23:
                return kt3.b(this.b, x7a.b0);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                t21 t21Var = new t21(this.b);
                t21Var.setLayoutParams(new ti3(-1, -1));
                t21Var.setVisibility(8);
                return t21Var;
            case 25:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, null);
                float f5 = 32;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(f5 * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 8388629;
                appCompatImageView.setLayoutParams(layoutParams);
                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                v3c.y(new a02(3, null, 0), appCompatImageView);
                int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
                appCompatImageView.setPadding(iG, iG, iG, iG);
                return appCompatImageView;
            case 26:
                TextView textView3 = new TextView(this.b);
                i4f.p.b(textView3, du4.b);
                textView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                float f6 = 12;
                textView3.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f6), tu0.G(4 * fk4.d().getDisplayMetrics().density), tu0.G(f6 * fk4.d().getDisplayMetrics().density), textView3.getPaddingBottom());
                textView3.setTextColor(qp4.u0.j(textView3).getText().b);
                return textView3;
            case 27:
                SharedPreferences sharedPreferences = this.b.getSharedPreferences("one.me.sdk.design.theme", 0);
                sharedPreferences.getAll();
                return sharedPreferences;
            case 28:
                return Boolean.valueOf(((InputMethodManager) this.b.getSystemService("input_method")).isActive());
            default:
                return a14.m(this.b);
        }
    }

    public /* synthetic */ a5(Context context, xg1 xg1Var) {
        this.a = 9;
        this.b = context;
    }
}

package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class xda implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ xda(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ImageView imageView = new ImageView(this.b);
                imageView.setId(xoc.Z);
                float f = 28;
                ti3 ti3Var = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                int i = xoc.a0;
                ti3Var.i = i;
                ti3Var.v = i;
                ti3Var.l = i;
                ti3Var.t = i;
                imageView.setLayoutParams(ti3Var);
                v3c.y(new ze2(3, null, 3), imageView);
                return imageView;
            case 1:
                return new EnhancedVectorDrawable(this.b, yfa.l);
            case 2:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, null);
                appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return appCompatImageView;
            case 3:
                gy3 gy3Var = new gy3(this.b, null);
                gy3Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return gy3Var;
            case 4:
                OneMeButton oneMeButton = new OneMeButton(this.b, null);
                oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                oneMeButton.setSize(c7a.a);
                oneMeButton.setAppearance(z6a.X);
                return oneMeButton;
            case 5:
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.b, null);
                appCompatTextView.setLayoutParams(new ti3(tu0.G(0 * fk4.d().getDisplayMetrics().density), -2));
                i4f.n.b(appCompatTextView, du4.b);
                qp4.u0.j(appCompatTextView).getText();
                appCompatTextView.setTextColor(-1);
                appCompatTextView.setMaxLines(2);
                return appCompatTextView;
            case 6:
                TextView textView = new TextView(this.b);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                i4f.n.b(textView, du4.b);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine();
                textView.setTextColor(qp4.u0.p(textView).c.getText().e);
                return textView;
            case 7:
                TextView textView2 = new TextView(this.b);
                textView2.setId(xoc.B0);
                i4f.j.b(textView2, du4.b);
                textView2.setLetterSpacing(0.0f);
                textView2.setSingleLine(true);
                np8.n(textView2);
                return textView2;
            case 8:
                ImageView imageView2 = new ImageView(this.b);
                imageView2.setId(xoc.z0);
                return imageView2;
            case 9:
                caa caaVar = new caa(this.b);
                caaVar.setId(xoc.A0);
                return caaVar;
            case 10:
                PopupWindow popupWindow = new PopupWindow(this.b);
                popupWindow.setBackgroundDrawable(null);
                popupWindow.setElevation(fk4.d().getDisplayMetrics().density * 12.0f);
                popupWindow.setFocusable(true);
                return popupWindow;
            case 11:
                Context context = this.b;
                MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "pip-media-session", new ComponentName(context, (Class<?>) k1b.class), null);
                mediaSessionCompat.setMetadata(new MediaMetadataCompat.Builder().putLong(MediaMetadataCompat.METADATA_KEY_DURATION, -1L).build());
                return mediaSessionCompat;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return kt3.b(this.b, gpc.O);
            case 13:
                return kt3.b(this.b, gpc.N);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return kt3.b(this.b, gpc.P);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new ph5(this.b);
            case 16:
                caa caaVar2 = new caa(this.b);
                caaVar2.setAppearance(x9a.b);
                return caaVar2;
            case LangUtils.HASH_SEED /* 17 */:
                ImageView imageView3 = new ImageView(this.b);
                float f2 = 40;
                imageView3.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                imageView3.setImageTintList(ColorStateList.valueOf(qp4.u0.j(imageView3).getIcon().k));
                rh4.p(8, fk4.d().getDisplayMetrics().density, imageView3);
                return imageView3;
            case 18:
                ImageView imageView4 = new ImageView(this.b);
                float f3 = 36;
                imageView4.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                imageView4.setImageTintList(ColorStateList.valueOf(qp4.u0.j(imageView4).getIcon().i));
                rh4.p(10, fk4.d().getDisplayMetrics().density, imageView4);
                return imageView4;
            case 19:
                TextView textView3 = new TextView(this.b);
                textView3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                textView3.setTextSize(32.0f);
                textView3.setTextAlignment(4);
                textView3.setGravity(17);
                textView3.setMaxLines(1);
                return textView3;
            case 20:
                return new ContextThemeWrapper(this.b, m2c.Theme_MaterialComponents);
            case 21:
                ViewStub viewStub = new ViewStub(this.b);
                viewStub.setId(y7a.C0);
                viewStub.setVisibility(8);
                return viewStub;
            case 22:
                ViewStub viewStub2 = new ViewStub(this.b);
                viewStub2.setId(y7a.E0);
                return viewStub2;
            case 23:
                ImageView imageView5 = new ImageView(this.b);
                imageView5.setId(y7a.D0);
                return imageView5;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                TextView textView4 = new TextView(this.b);
                textView4.setId(y7a.E0);
                textView4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                textView4.setTextColor(qp4.u0.p(textView4).c.getText().e);
                i4f.p.b(textView4, du4.b);
                textView4.setVisibility(8);
                textView4.setGravity(17);
                return textView4;
            case 25:
                return np8.D(this.b);
            case 26:
                return this.b.getResources().getStringArray(jsb.oneme_prefs_saved_messages_aliases);
            case 27:
                s5a s5aVar = new s5a(this.b);
                s5aVar.setId(pga.a);
                float f4 = 24;
                s5aVar.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density)));
                s5aVar.setAvatarShape(l5a.a);
                return s5aVar;
            case 28:
                return new up0(this.b);
            default:
                return new pm8(this.b);
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.text.NumberFormat;

/* loaded from: classes.dex */
public abstract class pu9 {
    public boolean a = false;
    public Object b;
    public Object c;
    public Object d;

    public pu9(FrameLayout frameLayout, l8b l8bVar) {
        this.c = frameLayout;
        this.d = l8bVar;
    }

    public void a(Bundle bundle) {
        if (this.a) {
            bundle.putCharSequence("android.summaryText", (CharSequence) this.d);
        }
        CharSequence charSequence = (CharSequence) this.c;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strE = e();
        if (strE != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strE);
        }
    }

    public abstract void b(m5d m5dVar);

    public RemoteViews c(int i) {
        boolean z;
        boolean z2;
        Resources resources = ((bu9) this.b).a.getResources();
        RemoteViews remoteViews = new RemoteViews(((bu9) this.b).a.getPackageName(), i);
        bu9 bu9Var = (bu9) this.b;
        int i2 = bu9Var.k;
        if (bu9Var.i != null) {
            remoteViews.setViewVisibility(twb.icon, 0);
            remoteViews.setImageViewBitmap(twb.icon, d(((bu9) this.b).i, 0, 0));
        }
        CharSequence charSequence = ((bu9) this.b).e;
        if (charSequence != null) {
            remoteViews.setTextViewText(twb.title, charSequence);
        }
        CharSequence charSequence2 = ((bu9) this.b).f;
        boolean z3 = true;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(twb.text, charSequence2);
            z = true;
        } else {
            z = false;
        }
        ((bu9) this.b).getClass();
        if (((bu9) this.b).j > 0) {
            if (((bu9) this.b).j > resources.getInteger(hyb.status_bar_notification_info_maxnum)) {
                remoteViews.setTextViewText(twb.info, resources.getString(r0c.status_bar_notification_info_overflow));
            } else {
                remoteViews.setTextViewText(twb.info, NumberFormat.getIntegerInstance().format(((bu9) this.b).j));
            }
            remoteViews.setViewVisibility(twb.info, 0);
            z = true;
            z2 = true;
        } else {
            remoteViews.setViewVisibility(twb.info, 8);
            z2 = false;
        }
        ((bu9) this.b).getClass();
        bu9 bu9Var2 = (bu9) this.b;
        if ((bu9Var2.l ? bu9Var2.F.when : 0L) == 0) {
            z3 = z2;
        } else if (bu9Var2.m) {
            remoteViews.setViewVisibility(twb.chronometer, 0);
            int i3 = twb.chronometer;
            bu9 bu9Var3 = (bu9) this.b;
            remoteViews.setLong(i3, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + (bu9Var3.l ? bu9Var3.F.when : 0L));
            remoteViews.setBoolean(twb.chronometer, "setStarted", true);
            ((bu9) this.b).getClass();
        } else {
            remoteViews.setViewVisibility(twb.time, 0);
            int i4 = twb.time;
            bu9 bu9Var4 = (bu9) this.b;
            remoteViews.setLong(i4, "setTime", bu9Var4.l ? bu9Var4.F.when : 0L);
        }
        remoteViews.setViewVisibility(twb.right_side, z3 ? 0 : 8);
        remoteViews.setViewVisibility(twb.line3, z ? 0 : 8);
        return remoteViews;
    }

    public Bitmap d(IconCompat iconCompat, int i, int i2) throws PackageManager.NameNotFoundException {
        Object obj;
        ApplicationInfo applicationInfo;
        Resources resourcesForApplication;
        Context context = ((bu9) this.b).a;
        if (iconCompat.a == 2 && (obj = iconCompat.b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4)) {
                    String strF = iconCompat.f();
                    if ("android".equals(strF)) {
                        resourcesForApplication = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            applicationInfo = packageManager.getApplicationInfo(strF, 8192);
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                    }
                    int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                    if (iconCompat.e != identifier) {
                        iconCompat.e = identifier;
                    }
                }
            }
        }
        Drawable drawableC = cs6.c(cs6.d(iconCompat, context), context);
        int intrinsicWidth = i2 == 0 ? drawableC.getIntrinsicWidth() : i2;
        if (i2 == 0) {
            i2 = drawableC.getIntrinsicHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
        drawableC.setBounds(0, 0, intrinsicWidth, i2);
        if (i != 0) {
            drawableC.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        drawableC.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public String e() {
        return null;
    }

    public abstract View f();

    public abstract Bitmap g();

    public RemoteViews h() {
        return null;
    }

    public RemoteViews i() {
        return null;
    }

    public abstract void j();

    public abstract void k();

    public abstract void l(see seeVar, u00 u00Var);

    public void m() {
        View viewF = f();
        if (viewF == null || !this.a) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        l8b l8bVar = (l8b) this.d;
        l8bVar.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            size.toString();
            return;
        }
        if (l8bVar.f()) {
            if (viewF instanceof TextureView) {
                ((TextureView) viewF).setTransform(l8bVar.d());
            } else {
                Display display = viewF.getDisplay();
                if (!l8bVar.g || display == null || display.getRotation() != l8bVar.e) {
                }
                boolean z = l8bVar.g;
                if (!z) {
                    if ((!z ? l8bVar.c : -kp.C(l8bVar.e)) != 0) {
                    }
                }
            }
            RectF rectFE = l8bVar.e(size, layoutDirection);
            viewF.setPivotX(0.0f);
            viewF.setPivotY(0.0f);
            viewF.setScaleX(rectFE.width() / l8bVar.a.getWidth());
            viewF.setScaleY(rectFE.height() / l8bVar.a.getHeight());
            viewF.setTranslationX(rectFE.left - viewF.getLeft());
            viewF.setTranslationY(rectFE.top - viewF.getTop());
        }
    }

    public void n(bu9 bu9Var) {
        if (((bu9) this.b) != bu9Var) {
            this.b = bu9Var;
            if (bu9Var != null) {
                bu9Var.q(this);
            }
        }
    }

    public abstract bm7 o();

    public pu9() {
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.RenderScript;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class hy4 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ hy4(iy4 iy4Var, Context context) {
        this.a = 0;
        this.b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k56
    public final Object invoke() {
        Object next;
        Object next2;
        int i = 3;
        int i2 = 1;
        Display defaultDisplay = null;
        switch (this.a) {
            case 0:
                Context context = this.b;
                Bitmap bitmapY = fp3.y(context, 0);
                int width = bitmapY != null ? bitmapY.getWidth() : 0;
                int i3 = context.getResources().getDisplayMetrics().densityDpi;
                int iIntValue = 48;
                Map mapA0 = mz7.a0(new kpa(240, 48), new kpa(320, 64), new kpa(480, 96), new kpa(640, 96));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapA0.entrySet()) {
                    if (((Number) entry.getKey()).intValue() <= i3) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int iIntValue2 = ((Number) ((Map.Entry) next).getKey()).intValue();
                        do {
                            Object next3 = it.next();
                            int iIntValue3 = ((Number) ((Map.Entry) next3).getKey()).intValue();
                            if (iIntValue2 < iIntValue3) {
                                next = next3;
                                iIntValue2 = iIntValue3;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry3 : mapA0.entrySet()) {
                    if (((Number) entry3.getKey()).intValue() > i3) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                Iterator it2 = linkedHashMap2.entrySet().iterator();
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (it2.hasNext()) {
                        int iIntValue4 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                        do {
                            Object next4 = it2.next();
                            int iIntValue5 = ((Number) ((Map.Entry) next4).getKey()).intValue();
                            if (iIntValue4 > iIntValue5) {
                                next2 = next4;
                                iIntValue4 = iIntValue5;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next2 = null;
                }
                Map.Entry entry4 = (Map.Entry) next2;
                String name = context.getClass().getName();
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, name, "phoneDensity: " + i3 + "; lowerDensity: " + entry2 + "; higherDensity: " + entry4, null);
                }
                if (entry4 != null && ((Number) entry4.getKey()).intValue() == i3) {
                    iIntValue = ((Number) entry4.getValue()).intValue();
                } else if ((entry2 != null ? (Integer) entry2.getKey() : null) != null && ((Number) entry2.getKey()).intValue() >= i3) {
                    iIntValue = ((Number) entry2.getValue()).intValue();
                } else if (entry4 != null) {
                    iIntValue = ((Number) entry4.getValue()).intValue();
                }
                String name2 = iy4.class.getName();
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    ir6Var2.d(us7.X, name2, rh4.h("Emoji size by density: ", iIntValue, context.getResources().getDisplayMetrics().densityDpi, ", density:"), null);
                }
                float f = width / 13;
                String name3 = iy4.class.getName();
                ir6 ir6Var3 = hm9.m;
                if (ir6Var3 != null && ir6Var3.c()) {
                    ir6Var3.d(us7.X, name3, "Calculated emoji size in sprite before coarce: " + f, null);
                }
                float f2 = iIntValue;
                if (f > f2) {
                    f = f2;
                }
                if (f <= 0.0f) {
                    String name4 = iy4.class.getName();
                    ir6 ir6Var4 = hm9.m;
                    if (ir6Var4 != null && ir6Var4.c()) {
                        ir6Var4.d(us7.X, name4, zr6.h(width, "Fallback for emoji size. Sprite width: "), null);
                    }
                    f = 48.0f;
                }
                String name5 = iy4.class.getName();
                ir6 ir6Var5 = hm9.m;
                if (ir6Var5 != null && ir6Var5.c()) {
                    ir6Var5.d(us7.X, name5, "Sprite width: " + width + "; Calculated emoji size in sprite: " + f, null);
                }
                return Float.valueOf(f);
            case 1:
                dw7 dw7Var = new dw7(this.b, null);
                dw7Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                dw7Var.setVisibility(8);
                return dw7Var;
            case 2:
                int i4 = EndlessRecyclerView2.i2;
                int i5 = Build.VERSION.SDK_INT;
                Context context2 = this.b;
                if (i5 >= 30) {
                    defaultDisplay = context2.getDisplay();
                } else {
                    WindowManager windowManager = (WindowManager) lt3.b(context2, WindowManager.class);
                    if (windowManager != null) {
                        defaultDisplay = windowManager.getDefaultDisplay();
                    }
                }
                return Long.valueOf((defaultDisplay != null ? defaultDisplay.getRefreshRate() : 0.0f) > 0.0f ? tu0.H(1000000000 / r12) : 160000000L);
            case 3:
                ay ayVar = new ay(this.b, 3);
                return new h84((Context) ayVar.o, (HashMap) ayVar.X, ayVar.c, (rhe) ayVar.Y, ayVar.b);
            case 4:
                return new h94(this.b);
            case 5:
                return new up0(this.b);
            case 6:
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.b, null);
                i4f.p.b(appCompatTextView, du4.b);
                appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                float f3 = 12;
                appCompatTextView.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(4 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density), appCompatTextView.getPaddingBottom());
                appCompatTextView.setTextColor(qp4.u0.j(appCompatTextView).getText().b);
                return appCompatTextView;
            case 7:
                y2b y2bVar = new y2b(this.b);
                y2bVar.a(woc.u0);
                return y2bVar;
            case 8:
                return RenderScript.create(this.b);
            case 9:
                h2a h2aVar = new h2a(this.b);
                i4f.G.b(h2aVar, du4.b);
                h2aVar.setMaxLines(1);
                h2aVar.setEllipsize(TextUtils.TruncateAt.END);
                float f4 = 12;
                h2aVar.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f4), h2aVar.getPaddingTop(), tu0.G(f4 * fk4.d().getDisplayMetrics().density), h2aVar.getPaddingBottom());
                h2aVar.setTextColor(qp4.u0.p(h2aVar).c.getText().e);
                np8.n(h2aVar);
                return h2aVar;
            case 10:
                View view = new View(this.b);
                view.setBackgroundColor(qp4.u0.p(view).c.i().b.c);
                return view;
            case 11:
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(this.b, null);
                appCompatTextView2.setTextColor(qp4.u0.j(appCompatTextView2).getText().b);
                i4f.p.b(appCompatTextView2, du4.b);
                appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                float f5 = 12;
                appCompatTextView2.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(4 * fk4.d().getDisplayMetrics().density), tu0.G(f5 * fk4.d().getDisplayMetrics().density), appCompatTextView2.getPaddingBottom());
                return appCompatTextView2;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                y2b y2bVar2 = new y2b(this.b);
                y2bVar2.a(woc.u0);
                return y2bVar2;
            case 13:
                uzd uzdVar = new uzd(this.b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 80;
                uzdVar.setLayoutParams(layoutParams);
                return uzdVar;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ImageView imageView = new ImageView(this.b);
                imageView.setId(xoc.W);
                float f6 = 36;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f6), tu0.G(f6 * fk4.d().getDisplayMetrics().density));
                layoutParams2.gravity = 16;
                layoutParams2.setMargins(tu0.G(12 * fk4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                imageView.setLayoutParams(layoutParams2);
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setImageResource(woc.b1);
                v3c.y(new ze2(i, null == true ? 1 : 0, i2), imageView);
                return imageView;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new s5a(this.b);
            case 16:
                OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(this.b);
                ya5 ya5Var = ((la6) oneMeDraweeView.getHierarchy()).e;
                ya5Var.w0 = 0;
                if (ya5Var.v0 == 1) {
                    ya5Var.v0 = 0;
                }
                return oneMeDraweeView;
            case LangUtils.HASH_SEED /* 17 */:
                int i6 = pub.ic_add_button_28;
                Context context3 = this.b;
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context3, i6);
                pq9 pq9Var = qp4.u0;
                c54.Z(enhancedVectorDrawable, "background", pq9Var.b(context3).i().b().a.f);
                c54.Z(enhancedVectorDrawable, "plus", pq9Var.b(context3).i().getIcon().b);
                return enhancedVectorDrawable;
            case 18:
                int i7 = jub.ic_online_24;
                Context context4 = this.b;
                EnhancedVectorDrawable enhancedVectorDrawable2 = new EnhancedVectorDrawable(context4, i7);
                pq9 pq9Var2 = qp4.u0;
                c54.Z(enhancedVectorDrawable2, "online", k7d.h(pq9Var2, context4).e);
                ne0 ne0VarB = pq9Var2.b(context4).i().b();
                VectorPath vectorPathFindPath = enhancedVectorDrawable2.findPath("online");
                if (vectorPathFindPath != null) {
                    vectorPathFindPath.setStrokeColor(ne0VarB.k);
                    enhancedVectorDrawable2.invalidatePath();
                }
                return enhancedVectorDrawable2;
            case 19:
                int i8 = jub.ic_delete_filled_apart_24;
                Context context5 = this.b;
                EnhancedVectorDrawable enhancedVectorDrawable3 = new EnhancedVectorDrawable(context5, i8);
                pq9 pq9Var3 = qp4.u0;
                pq9Var3.b(context5).i().getIcon();
                c54.Z(enhancedVectorDrawable3, "cross", -1);
                c54.Z(enhancedVectorDrawable3, "circle_background", k7d.h(pq9Var3, context5).j);
                return enhancedVectorDrawable3;
            case 20:
                bc7[] bc7VarArr = OneMeButton.B0;
                return new AppCompatImageView(this.b, null);
            case 21:
                bc7[] bc7VarArr2 = OneMeButton.B0;
                return new AppCompatImageView(this.b, null);
            case 22:
                bc7[] bc7VarArr3 = OneMeButton.B0;
                return new TextView(this.b);
            case 23:
                TextView textView = new TextView(this.b);
                textView.setId(xoc.j);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMaxLines(1);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams3.gravity = 17;
                textView.setLayoutParams(layoutParams3);
                textView.setGravity(17);
                textView.setTextAlignment(4);
                i4f.F.b(textView, du4.b);
                return textView;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ImageView imageView2 = new ImageView(this.b);
                float f7 = 24;
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f7), tu0.G(f7 * fk4.d().getDisplayMetrics().density)));
                imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return imageView2;
            case 25:
                AppCompatTextView appCompatTextView3 = new AppCompatTextView(this.b, null);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams4.topMargin = tu0.G(4 * fk4.d().getDisplayMetrics().density);
                float f8 = 6;
                layoutParams4.leftMargin = tu0.G(fk4.d().getDisplayMetrics().density * f8);
                layoutParams4.rightMargin = tu0.G(f8 * fk4.d().getDisplayMetrics().density);
                appCompatTextView3.setLayoutParams(layoutParams4);
                appCompatTextView3.setGravity(1);
                appCompatTextView3.setMaxLines(1);
                appCompatTextView3.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView3.setTextColor(qp4.u0.j(appCompatTextView3).getText().e);
                i4f.s.b(appCompatTextView3, du4.b);
                return appCompatTextView3;
            case 26:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, null);
                appCompatImageView.setId(xoc.l);
                ti3 ti3Var = new ti3(0, 0);
                ti3Var.t = 0;
                ti3Var.i = 0;
                ti3Var.v = 0;
                ti3Var.l = 0;
                appCompatImageView.setLayoutParams(ti3Var);
                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return appCompatImageView;
            case 27:
                ImageView imageView3 = new ImageView(this.b);
                imageView3.setId(xoc.n);
                ti3 ti3Var2 = new ti3(-2, -2);
                int i9 = xoc.o;
                ti3Var2.i = i9;
                ti3Var2.v = i9;
                ti3Var2.l = i9;
                ti3Var2.t = i9;
                imageView3.setLayoutParams(ti3Var2);
                v3c.y(new ze2(i, null == true ? 1 : 0, 2), imageView3);
                return imageView3;
            case 28:
                return new EnhancedVectorDrawable(this.b, yfa.l);
            default:
                return new ContextThemeWrapper(this.b, m2c.Theme_MaterialComponents);
        }
    }

    public /* synthetic */ hy4(Context context, int i) {
        this.a = i;
        this.b = context;
    }
}

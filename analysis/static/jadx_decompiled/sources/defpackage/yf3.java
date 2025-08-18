package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.OneMeApplication;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class yf3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yf3(ns3 ns3Var) {
        this.a = 2;
        je7 je7Var = iyc.q;
        this.b = ns3Var;
        this.c = je7Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        String str;
        xx6 xx6Var;
        String[] strArrNames;
        pq9 pq9Var = qp4.u0;
        e5f e5fVar = e5f.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                int i = ConfirmRemoveOpponentToCallBottomSheet.B0;
                gg1 gg1Var = (gg1) ((Bundle) obj2).getParcelable("opponent_id");
                zi1 zi1Var = zi1.a;
                return new cg3(gg1Var, zi1Var.b(), new eo1(new md1(21, (ConfirmRemoveOpponentToCallBottomSheet) obj), zi1Var.b(), zi1Var.getAccessor().d(kke.class), yi1.c(), yi1.a, yi1.a(), yi1.d()));
            case 1:
                ((m56) obj2).invoke(Long.valueOf(((nn3) obj).a));
                return e5fVar;
            case 2:
                ArrayList arrayList = new ArrayList(((ns3) obj2).a.k());
                ((oq3) ((je7) obj).getValue()).b(arrayList);
                return arrayList;
            case 3:
                return j1e.a(((w9a) ((kke) ((je7) obj2).getValue())).b().limitedParallelism(2, "emoji_sprite_loader").plus(new qj((gy4) obj)));
            case 4:
                cz4 cz4Var = (cz4) obj2;
                return new gy4(cz4Var.d, cz4Var.a, (je7) obj);
            case 5:
                Context context = (Context) obj2;
                int i2 = maf.a;
                try {
                    str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException unused) {
                    str = "?";
                }
                String str2 = Build.VERSION.RELEASE;
                StringBuilder sb = new StringBuilder(rh4.e(rh4.e(47, str), str2));
                sb.append("ExoPlayer/");
                sb.append(str);
                sb.append(" (Linux;Android ");
                sb.append(str2);
                sb.append(") ExoPlayerLib/2.17.1");
                return new k94(context, sb.toString(), (h84) ((m65) obj).b.getValue());
            case 6:
                mw0 mw0Var = new mw0();
                mw0Var.a = (gw0) ((je7) obj2).getValue();
                mw0Var.d = (q24) ((n65) obj).a.getValue();
                mw0Var.e = 2;
                return mw0Var;
            case 7:
                ((m56) obj2).invoke(Long.valueOf(((fb5) obj).a));
                return e5fVar;
            case 8:
                m56 m56Var = ((hb5) obj2).G0;
                if (m56Var != null) {
                    m56Var.invoke(Long.valueOf(((fb5) obj).a));
                }
                return e5fVar;
            case 9:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj;
                ((FrameLayout) obj2).removeCallbacks(fakeInAppReviewBottomSheet.F0);
                if (fakeInAppReviewBottomSheet.G0 && (xx6Var = (xx6) tx6.a.getAccessor().e()) != null) {
                    xx6Var.b(4);
                }
                return e5fVar;
            case 10:
                ki5 ki5Var = (ki5) obj2;
                return new oi5(ki5Var.c, ki5Var.b, (mi5) obj);
            case 11:
                ((jx5) obj2).Y.i.remove((hx5) obj);
                return e5fVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                bc7[] bc7VarArr = ForwardPickerScreen.I0;
                ForwardPickerScreen forwardPickerScreen = (ForwardPickerScreen) obj2;
                ((iz5) forwardPickerScreen.v0().c).r.z(4);
                br7.d((View) obj, ForwardPickerScreen.J0, null);
                forwardPickerScreen.y0().setLeftIcon(woc.a1);
                return e5fVar;
            case 13:
                bc7[] bc7VarArr2 = ForwardPickerScreen.I0;
                ForwardPickerScreen forwardPickerScreen2 = (ForwardPickerScreen) obj2;
                ((iz5) forwardPickerScreen2.v0().c).h(((sv8) obj).getText(), (Set) forwardPickerScreen2.v0().Z.a.getValue(), forwardPickerScreen2.B0());
                return e5fVar;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ja7 ja7Var = (ja7) obj;
                r6d r6dVar = (r6d) obj2;
                boolean z = ja7Var.a.m && tpa.f(r6dVar.e(), w6d.f);
                tu0.t(ja7Var, r6dVar);
                int iF = r6dVar.f();
                for (int i3 = 0; i3 < iF; i3++) {
                    List listH = r6dVar.h(i3);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : listH) {
                        if (obj3 instanceof xa7) {
                            arrayList2.add(obj3);
                        }
                    }
                    xa7 xa7Var = (xa7) (arrayList2.size() == 1 ? arrayList2.get(0) : null);
                    if (xa7Var != null && (strArrNames = xa7Var.names()) != null) {
                        for (String lowerCase : strArrNames) {
                            if (z) {
                                lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                            }
                            tu0.b(linkedHashMap, r6dVar, lowerCase, i3);
                        }
                    }
                    String lowerCase2 = z ? r6dVar.g(i3).toLowerCase(Locale.ROOT) : null;
                    if (lowerCase2 != null) {
                        tu0.b(linkedHashMap, r6dVar, lowerCase2, i3);
                    }
                }
                return linkedHashMap.isEmpty() ? oz4.a : linkedHashMap;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                bc7[] bc7VarArr3 = MediaGalleryWidget.Z;
                qj qjVar = new qj(jyc.a.i());
                je7 je7VarB = fua.a.b();
                la8 la8Var = la8.a;
                hq7 hq7Var = (hq7) la8Var.getAccessor().c(hq7.class);
                je7 je7Var = iyc.a;
                Object objV = ay7.v((Bundle) obj2, "arg_gallery_mode", d86.class);
                if (objV == null) {
                    throw new IllegalArgumentException(zr6.i("No value passed for key arg_gallery_mode of type ", d86.class.getSimpleName(), " in bundle").toString());
                }
                MediaGalleryWidget mediaGalleryWidget = (MediaGalleryWidget) obj;
                return new z96((d86) ((Parcelable) objV), mediaGalleryWidget.getContext(), qjVar, (xp7) la8Var.getAccessor().c(xp7.class), hq7Var, je7VarB, la8Var.getAccessor().d(y7d.class), mediaGalleryWidget.n0());
            case 16:
                uc7 uc7Var = (uc7) ((hc8) obj2).d.invoke();
                if (uc7Var != null) {
                    uc7Var.O();
                }
                ((k56) obj).invoke();
                return e5fVar;
            case LangUtils.HASH_SEED /* 17 */:
                ImageView imageView = new ImageView((Context) obj2);
                imageView.setId(xoc.U);
                float f = 28;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 80;
                sv8 sv8Var = (sv8) obj;
                layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, sv8Var.a);
                imageView.setLayoutParams(layoutParams);
                imageView.setImageResource(sv8Var.o);
                imageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(imageView).a().h().b.b));
                return imageView;
            case 18:
                n59 n59Var = (n59) obj;
                return new eg9((je7) obj2, n59Var.a, n59Var.Y, n59Var.q1, new vw(2, n59Var, n59.class, "onMessageAction", "onMessageAction(Ljava/util/List;I)V", 0, 28));
            case 19:
                s35 s35Var = ((n59) obj2).v1;
                u29 u29Var = u29.c;
                String str3 = ((aj7) ((ej7) obj)).a;
                u29Var.getClass();
                wg0.k(":call-join-preview?link=".concat(str3), s35Var);
                return e5fVar;
            case 20:
                return new zc0(((wa9) obj2).b, (je7) obj);
            case 21:
                return new ar9((sx3) ((dr9) obj2).a.getValue(), (je7) obj);
            case 22:
                c5a c5aVar = (c5a) obj2;
                String str4 = ((OneMeApplication) obj).Y;
                try {
                    gze.a(c5aVar);
                    hm9.n(str4, "Tracer init success!");
                } catch (Throwable th) {
                    hm9.p(str4 + "/Tracer", "failed when init", th);
                }
                return e5fVar;
            case 23:
                nfa nfaVar = new nfa((Context) obj2);
                nfaVar.setId(xoc.h);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                nfaVar.setLayoutParams(layoutParams2);
                nfaVar.setAppearance(afa.a);
                nfaVar.setSize(ifa.a);
                br7.b((f7a) obj, nfaVar, -1);
                return nfaVar;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new h8a((je7) obj2, ((qi8) obj).o);
            case 25:
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable((Context) obj2, jub.ic_cancel_filled_24);
                pq9Var.j((g9a) obj).getIcon();
                c54.Z(enhancedVectorDrawable, "circle_background", -1);
                return enhancedVectorDrawable;
            case 26:
                int i4 = taa.f;
                ((taa) obj2).a().e.remove((raa) obj);
                return e5fVar;
            case 27:
                StringBuilder sbO = rh4.o(kk5.g(((kk5) ((uca) obj2).b.b.getValue()).c(), "logs").getAbsolutePath(), File.separator);
                sbO.append(((qca) obj).a);
                return sbO.toString();
            case 28:
                xha xhaVar = (xha) ((i50) obj2).Y;
                if (xhaVar != null) {
                    xhaVar.I((yha) obj);
                }
                return e5fVar;
            default:
                qaa qaaVar = new qaa((Context) obj2);
                qaaVar.setId(xoc.A0);
                int iS = au1.s(((vja) obj).getTabItem().c);
                paa paaVar = paa.a;
                if (iS != 0) {
                    if (iS == 1) {
                        paaVar = paa.b;
                    } else if (iS != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                qaaVar.setAppearance(paaVar);
                return qaaVar;
        }
    }

    public /* synthetic */ yf3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}

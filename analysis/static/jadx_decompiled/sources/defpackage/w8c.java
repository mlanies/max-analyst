package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Collections;
import one.me.android.OneMeApplication;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.stickersshowcase.StickersShowcaseScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.settings.ActSettings;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class w8c implements m56 {
    public final /* synthetic */ int a;

    public /* synthetic */ w8c(int i) {
        this.a = i;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        switch (this.a) {
            case 0:
                fka fkaVar = (fka) obj;
                fkaVar.getIcon();
                return new dcf(-1, fkaVar.getIcon().k);
            case 1:
                return ote.s(((TamErrorException) obj).a);
            case 2:
                ((u82) obj).h = null;
                return e5fVar;
            case 3:
                return Integer.valueOf(((fka) obj).getText().g);
            case 4:
                return Integer.valueOf(((fka) obj).b().g);
            case 5:
                t5d t5dVar = new t5d((Context) obj);
                t5dVar.setId(mda.J);
                t5dVar.setWillNotDraw(false);
                return t5dVar;
            case 6:
                return new dcf(0, ((fka) obj).a().d(true).d.d);
            case 7:
                Context context = (Context) obj;
                int i = xxb.setting_media_caching;
                int i2 = ActSettings.V0;
                Intent intent = new Intent(context, (Class<?>) ActSettings.class);
                intent.putExtra("ru.ok.tamtam.extra.SETTING_ID", i);
                intent.putExtra("ru.ok.tamtam.extra.SHOW_PUSH_ALERT", false);
                context.startActivity(intent);
                return e5fVar;
            case 8:
                return Boolean.valueOf(((uj3) obj).w());
            case 9:
                bc7[] bc7VarArr = StickersShowcaseScreen.v0;
                y6e.c.P1().b(":stickers/settings", null);
                return e5fVar;
            case 10:
                bc7[] bc7VarArr2 = b8e.B0;
                return Boolean.TRUE;
            case 11:
                nsd nsdVar = (nsd) obj;
                h23 h23VarA = nec.a(ne7.class);
                nsdVar.getClass();
                String canonicalName = h23VarA.a().getCanonicalName();
                ArrayList arrayList = nsdVar.a;
                if (canonicalName != null) {
                    arrayList.add(Collections.singletonList(canonicalName));
                }
                arrayList.add(Collections.singletonList("leakcanary.internal.LeakCanaryFileProvider"));
                nsdVar.a(nec.a(br7.class), nec.a(z7.class));
                nsdVar.a(nec.a(OneMeApplication.class), nec.a(Typeface.class));
                return e5fVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                nsd nsdVar2 = (nsd) obj;
                h23 h23VarA2 = nec.a(jo7.class);
                nsdVar2.getClass();
                String canonicalName2 = h23VarA2.a().getCanonicalName();
                if (canonicalName2 != null) {
                    nsdVar2.a.add(Collections.singletonList(canonicalName2));
                }
                return e5fVar;
            case 13:
                CharSequence charSequence = ((ybe) obj).e;
                return Boolean.valueOf(!(charSequence == null || charSequence.length() == 0));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((kzc) obj).X;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return ((op3) obj).a();
            case 16:
                CharSequence charSequence2 = ((ybe) obj).e;
                return Boolean.valueOf(!(charSequence2 == null || charSequence2.length() == 0));
            case LangUtils.HASH_SEED /* 17 */:
                return Integer.valueOf(((fka) obj).getText().j);
            case 18:
                tne tneVar = (tne) obj;
                return "t=" + tneVar.a + ", c=" + tneVar.b;
            case 19:
                return Integer.valueOf(((fka) obj).getText().d);
            case 20:
                return new ei4(ei4.b.incrementAndGet());
            case 21:
                return Long.valueOf(((fs8) obj).a);
            case 22:
                return Long.valueOf(((cu8) obj).k());
            case 23:
                return Long.valueOf(((cu8) obj).b);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((cu8) obj).v0;
            case 25:
                return ((dk2) obj).a.toString();
            case 26:
                amf amfVar = new amf((Context) obj);
                amfVar.setVisibility(8);
                amfVar.setAlpha(0.0f);
                return amfVar;
            case 27:
                return String.valueOf(((qlf) obj).b);
            case 28:
                fka fkaVar2 = (fka) obj;
                bc7[] bc7VarArr3 = WebAppRootScreen.G0;
                fkaVar2.getIcon();
                return new dcf(-1, fkaVar2.getIcon().k);
            default:
                return zr6.i("worker_class_name LIKE '", (String) obj, "%'");
        }
    }
}

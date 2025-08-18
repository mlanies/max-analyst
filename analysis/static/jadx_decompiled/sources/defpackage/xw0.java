package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.media3.common.VideoFrameProcessingException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.sdk.api.BatchInternalIdResponse;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.messages.views.ActProfilePhoto;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class xw0 implements o1d, qa5, ra5, qj3, kwe, ru0, NativeDoubleArrayConsumer.Consumer, b66, dd6, za7 {
    public final /* synthetic */ int a;
    public static final xw0 b = new xw0(0);
    public static final xw0 c = new xw0(1);
    public static final xw0 o = new xw0(2);
    public static final xw0 X = new xw0(3);
    public static final xw0 Y = new xw0(4);
    public static final xw0 Z = new xw0(5);

    public /* synthetic */ xw0(int i) {
        this.a = i;
    }

    @Override // defpackage.qa5
    public ka5[] a() {
        switch (this.a) {
            case 7:
                return new ka5[]{new q3()};
            case 8:
            default:
                return new ka5[]{new dc()};
            case 9:
                return new ka5[]{new u3()};
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 11:
                HashSet hashSet = ActAttachesView.z1;
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                int i = ActContactAvatars.h1;
                hm9.p("ru.ok.messages.contacts.profile.ActContactAvatars", "During deleting self photo got error", (Throwable) obj);
                break;
            case 13:
                int i2 = ActContactAvatars.h1;
                hm9.p("ru.ok.messages.contacts.profile.ActContactAvatars", "During making photo main got error", (Throwable) obj);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
            case 16:
            case LangUtils.HASH_SEED /* 17 */:
            case 18:
            case 19:
            case 23:
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
            default:
                hm9.p("qy7", "loadMarkerIcon: can't load marker", (Throwable) obj);
                break;
            case 20:
                ((j10) obj).i = d20.X;
                break;
            case 21:
                hm9.o("rz", "Can't update not started live video");
                break;
            case 22:
                int i3 = AttachPhotoView.U0;
                hm9.p("ru.ok.messages.media.attaches.AttachPhotoView", "Can't save file", (Throwable) obj);
                break;
            case 25:
                hm9.p("qy7", "loadMarkerIcon: can't load marker", (Throwable) obj);
                break;
            case 26:
                hm9.p("qy7", "loadMarkerIcon: can't load marker", (Throwable) obj);
                break;
            case 27:
                hm9.p("qy7", "setMapStyle: can't load map style", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        return Uri.fromFile((File) obj);
    }

    @Override // defpackage.dd6, defpackage.wff
    public void c(VideoFrameProcessingException videoFrameProcessingException) {
    }

    @Override // org.webrtc.NativeDoubleArrayConsumer.Consumer
    public void consume(Double[] dArr) {
    }

    public String e(a34 a34Var) {
        String str = a34Var.h;
        return str != null ? str : a34Var.a.toString();
    }

    public zw6 f(String str) {
        zw6 zw6VarJ;
        zw6 zw6VarF = h15.f(str);
        ge4 ge4Var = new ge4(1, str);
        zw6VarF.getClass();
        Iterable k77Var = new k77(zw6VarF, ge4Var);
        if (k77Var instanceof Collection) {
            zw6VarJ = zw6.j((Collection) k77Var);
        } else {
            p1 p1Var = (p1) k77Var.iterator();
            if (p1Var.hasNext()) {
                Object next = p1Var.next();
                if (p1Var.hasNext()) {
                    ww6 ww6Var = new ww6(4);
                    ww6Var.a(next);
                    while (p1Var.hasNext()) {
                        ww6Var.a(p1Var.next());
                    }
                    zw6VarJ = ww6Var.j();
                } else {
                    zw6VarJ = zw6.n(next);
                }
            } else {
                zw6VarJ = ffc.X;
            }
        }
        return zw6VarJ.isEmpty() ? zw6VarF : zw6VarJ;
    }

    @Override // defpackage.ru0
    public su0 g(Bundle bundle) {
        p8[] p8VarArr;
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
                if (parcelableArrayList == null) {
                    p8VarArr = new p8[0];
                } else {
                    p8[] p8VarArr2 = new p8[parcelableArrayList.size()];
                    for (int i = 0; i < parcelableArrayList.size(); i++) {
                        p8VarArr2[i] = (p8) p8.s0.g((Bundle) parcelableArrayList.get(i));
                    }
                    p8VarArr = p8VarArr2;
                }
                return new r8(p8VarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
            default:
                long j = bundle.getLong(Integer.toString(0, 36));
                int i2 = bundle.getInt(Integer.toString(1, 36), -1);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(2, 36));
                int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
                long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
                return new p8(j, i2, intArray == null ? new int[0] : intArray, parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, bundle.getLong(Integer.toString(5, 36)), bundle.getBoolean(Integer.toString(6, 36)));
        }
    }

    @Override // defpackage.o1d
    public int i(int i) {
        int i2 = AboutAppSettingsScreen.c;
        return 4;
    }

    @Override // defpackage.kwe
    public boolean onMenuItemClick(MenuItem menuItem) {
        int i = ActProfilePhoto.Y0;
        return false;
    }

    @Override // defpackage.za7
    public Object parse(db7 db7Var) {
        return BatchInternalIdResponse.parse(db7Var);
    }

    @Override // defpackage.ra5
    /* renamed from: a */
    public la5[] mo8a() {
        switch (this.a) {
            case 8:
                return new la5[]{new r3()};
            case 9:
            default:
                return new la5[]{new ec(0)};
            case 10:
                return new la5[]{new v3()};
        }
    }
}

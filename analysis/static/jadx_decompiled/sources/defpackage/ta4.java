package defpackage;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import org.apache.http.util.LangUtils;
import org.webrtc.EglThread;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class ta4 implements w56, ru0, cc3, o1d, qj3, qr4, rr4, EglThread.ReleaseMonitor, km7, jm7, b66 {
    public final /* synthetic */ int a;

    public /* synthetic */ ta4(int i) {
        this.a = i;
    }

    private final void b() {
    }

    private final void c() {
    }

    public Constructor a() {
        switch (this.a) {
            case 0:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(la5.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(la5.class).getConstructor(null);
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 6:
                ((j10) obj).m = "";
                break;
            case 10:
                hm9.p("sx4", "Can't invalidate", (Throwable) obj);
                break;
            case 28:
                hm9.p("sc5", "failed favorites obs", (Throwable) obj);
                break;
            default:
                hm9.m("sc5", "on next favorite ids to subject: %s", (List) obj);
                break;
        }
    }

    @Override // defpackage.w56, defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 2:
                tze tzeVar = (tze) obj;
                tzeVar.getClass();
                Bundle bundle = new Bundle();
                ffc ffcVar = tzeVar.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(ffcVar.o);
                ls5 ls5VarListIterator = ffcVar.listIterator(0);
                while (ls5VarListIterator.hasNext()) {
                    arrayList.add(((rze) ls5VarListIterator.next()).f());
                }
                bundle.putParcelableArrayList(tze.e, arrayList);
                return bundle;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new h74((rhe) obj);
            case 16:
                return new i74((she) obj);
            case 21:
                od5 od5Var = (od5) obj;
                od5Var.getClass();
                return new sa3(2, new ia4(3, od5Var));
            case 22:
                final od5 od5Var2 = (od5) obj;
                Objects.requireNonNull(od5Var2);
                final int i = 0;
                return new q1a(2, new Callable() { // from class: dc5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i2 = i;
                        od5 od5Var3 = od5Var2;
                        switch (i2) {
                            case 0:
                                od5Var3.getClass();
                                xlc xlcVarA = xlc.a(0, "SELECT COUNT(*) FROM favorite_stickers");
                                ilc ilcVar = od5Var3.a;
                                ilcVar.b();
                                Cursor cursorO = ilcVar.o(xlcVarA, null);
                                try {
                                    long j = cursorO.moveToFirst() ? cursorO.getLong(0) : 0L;
                                    cursorO.close();
                                    xlcVarA.n();
                                    return Long.valueOf(j);
                                } catch (Throwable th) {
                                    cursorO.close();
                                    xlcVarA.n();
                                    throw th;
                                }
                            default:
                                return od5Var3.c();
                        }
                    }
                });
            case 23:
                return ((OneMeRoomDatabase) obj).B();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                final od5 od5Var3 = (od5) obj;
                Objects.requireNonNull(od5Var3);
                final int i2 = 1;
                return new q1a(2, new Callable() { // from class: dc5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i22 = i2;
                        od5 od5Var32 = od5Var3;
                        switch (i22) {
                            case 0:
                                od5Var32.getClass();
                                xlc xlcVarA = xlc.a(0, "SELECT COUNT(*) FROM favorite_stickers");
                                ilc ilcVar = od5Var32.a;
                                ilcVar.b();
                                Cursor cursorO = ilcVar.o(xlcVarA, null);
                                try {
                                    long j = cursorO.moveToFirst() ? cursorO.getLong(0) : 0L;
                                    cursorO.close();
                                    xlcVarA.n();
                                    return Long.valueOf(j);
                                } catch (Throwable th) {
                                    cursorO.close();
                                    xlcVarA.n();
                                    throw th;
                                }
                            default:
                                return od5Var32.c();
                        }
                    }
                });
            case 25:
                od5 od5Var4 = (od5) obj;
                od5Var4.getClass();
                uh uhVar = new uh(od5Var4, 7, xlc.a(0, "SELECT id FROM favorite_stickers ORDER BY `index` ASC"));
                return ngg.o((OneMeRoomDatabase) od5Var4.a, new String[]{"favorite_stickers"}, uhVar);
            case 26:
                return new uqd(((wc5) obj).a(), new nc5(10), 0);
            default:
                return new q28(((wc5) obj).a(), new nc5(11), 3);
        }
    }

    @Override // defpackage.cc3
    public Object f(bg4 bg4Var) {
        switch (this.a) {
            case 4:
                Set setB = bg4Var.b(lqb.a(va0.class));
                wd6 wd6Var = wd6.c;
                if (wd6Var == null) {
                    synchronized (wd6.class) {
                        try {
                            wd6Var = wd6.c;
                            if (wd6Var == null) {
                                wd6Var = new wd6(0);
                                wd6.c = wd6Var;
                            }
                        } finally {
                        }
                    }
                }
                return new ef4(setB, wd6Var);
            case 11:
                return ExecutorsRegistrar.lambda$getComponents$4(bg4Var);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ExecutorsRegistrar.lambda$getComponents$5(bg4Var);
            case 13:
                return ExecutorsRegistrar.lambda$getComponents$6(bg4Var);
            default:
                return ExecutorsRegistrar.lambda$getComponents$7(bg4Var);
        }
    }

    @Override // defpackage.ru0
    public su0 g(Bundle bundle) {
        boolean z = false;
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int i2 = bundle.getInt(Integer.toString(2, 36), -1);
        if (i >= 0 && i2 >= 0) {
            z = true;
        }
        np8.d(z);
        intArray.getClass();
        return new qe4(i, i2, intArray);
    }

    @Override // defpackage.o1d
    public int i(int i) {
        bc7[] bc7VarArr = DialogNotificationsSettingsScreen.Y;
        return 4;
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        switch (this.a) {
            case LangUtils.HASH_SEED /* 17 */:
                ((n3b) obj).x0(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), 1003));
                break;
            case 18:
                ((m3b) obj).p();
                break;
            case 19:
                ((m3b) obj).getClass();
                break;
            default:
                ((n3b) obj).i0();
                break;
        }
    }

    @Override // org.webrtc.EglThread.ReleaseMonitor
    public boolean onRelease(EglThread eglThread) {
        return EglThread.lambda$create$1(eglThread);
    }

    @Override // defpackage.qr4, defpackage.rr4
    public void release() {
        int i = this.a;
    }
}

package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.biometric.FingerprintDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.WorkRequest;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import one.me.chats.list.ChatsListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.list.FoldersListScreen;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.messages.messages.widgets.Chronometer;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ re(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public wbd a() {
        v47 v47Var = (v47) this.b;
        wbd wbdVar = new wbd();
        Cursor cursorO = v47Var.a.o(new sy4(28, "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (cursorO.moveToNext()) {
            try {
                wbdVar.add(Integer.valueOf(cursorO.getInt(0)));
            } finally {
            }
        }
        v3c.i(cursorO, null);
        wbd wbdVarA = z7.a(wbdVar);
        if (!wbdVarA.a.isEmpty()) {
            if (((v47) this.b).h == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            q36 q36Var = ((v47) this.b).h;
            if (q36Var == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            q36Var.n();
        }
        return wbdVarA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        bta btaVar;
        Set setA;
        switch (this.a) {
            case 0:
                se seVar = (se) this.b;
                seVar.unscheduleSelf(this);
                seVar.invalidateSelf();
                return;
            case 1:
                synchronized (((wf) this.b)) {
                    wf wfVar = (wf) this.b;
                    wfVar.a = false;
                    if (((hc9) wfVar.o).now() - wfVar.b > 2000) {
                        pn0 pn0Var = (pn0) ((wf) this.b).Y;
                        if (pn0Var != null) {
                            if (pn0Var.X) {
                                xn0 xn0Var = pn0Var.Y;
                                if (xn0Var != null) {
                                    xn0Var.h();
                                }
                            } else {
                                pn0Var.clear();
                            }
                        }
                    } else {
                        ((wf) this.b).a();
                    }
                }
                return;
            case 2:
                ((ry1) this.b).resumeWith(e5f.a);
                return;
            case 3:
                yl7 yl7Var = (yl7) this.b;
                if (yl7Var.z0) {
                    boolean z = yl7Var.x0;
                    i90 i90Var = yl7Var.a;
                    if (z) {
                        yl7Var.x0 = false;
                        i90Var.getClass();
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        i90Var.e = jCurrentAnimationTimeMillis;
                        i90Var.g = -1L;
                        i90Var.f = jCurrentAnimationTimeMillis;
                        i90Var.h = 0.5f;
                    }
                    if ((i90Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > i90Var.g + i90Var.i) || !yl7Var.e()) {
                        yl7Var.z0 = false;
                        return;
                    }
                    boolean z2 = yl7Var.y0;
                    View view = yl7Var.c;
                    if (z2) {
                        yl7Var.y0 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        view.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (i90Var.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = i90Var.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - i90Var.f;
                    i90Var.f = jCurrentAnimationTimeMillis2;
                    yl7Var.B0.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * i90Var.d));
                    WeakHashMap weakHashMap = zmf.a;
                    view.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                int i = f6b.w0;
                ((f6b) this.b).setHalfScreen(null);
                return;
            case 5:
                for (Thread thread : vo0.x.keySet()) {
                    if (!thread.isAlive()) {
                        vo0.x.remove(thread);
                    }
                }
                if (vo0.x.isEmpty()) {
                    vo0.y = false;
                    return;
                } else {
                    he.e(((vo0) this.b).p, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                    return;
                }
            case 6:
                er0 er0Var = (er0) this.b;
                er0Var.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) er0Var.e;
                dnf dnfVar = bottomSheetBehavior.M;
                if (dnfVar != null && dnfVar.f()) {
                    er0Var.b(er0Var.b);
                    return;
                } else {
                    if (bottomSheetBehavior.L == 2) {
                        bottomSheetBehavior.L(er0Var.b);
                        return;
                    }
                    return;
                }
            case 7:
                oe1 oe1Var = (oe1) this.b;
                Iterator it = oe1Var.i.iterator();
                while (it.hasNext()) {
                    ((cp1) ((ne1) it.next())).l.a(oe1Var.a);
                }
                me1 me1Var = oe1Var.e;
                me1Var.getClass();
                try {
                    me1Var.k.postDelayed(this, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                    return;
                } catch (IllegalStateException e) {
                    me1Var.a.reportException(me1Var.j, "OpenGL tread died, is it fine?", e);
                    return;
                }
            case 8:
                ((nfa) this.b).setAppearance(cfa.a);
                return;
            case 9:
                bc7[] bc7VarArr = ChatsListWidget.M0;
                ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
                if (!((mt2) chatsListWidget.p0().G0.getValue()).b && ((mt2) chatsListWidget.p0().H0.a.getValue()).a.isEmpty() && ((List) chatsListWidget.p0().K0.a.getValue()).isEmpty() && ((List) chatsListWidget.p0().L0.a.getValue()).isEmpty()) {
                    chatsListWidget.L0.b(Collections.singletonList(new dta(0)));
                    return;
                }
                return;
            case 10:
                Chronometer chronometer = (Chronometer) this.b;
                if (chronometer.x0) {
                    chronometer.k(SystemClock.elapsedRealtime());
                    chronometer.postDelayed(chronometer.G0, 1000L);
                    return;
                }
                return;
            case 11:
                md4 md4Var = (md4) this.b;
                try {
                    Runnable runnable = (Runnable) md4Var.o.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        int i2 = md4.s0;
                        ta5.d(md4.class, md4Var.a, "%s: Worker has nothing to run");
                    }
                    int iDecrementAndGet = md4Var.Y.decrementAndGet();
                    if (!md4Var.o.isEmpty()) {
                        md4Var.b();
                        return;
                    } else {
                        int i3 = md4.s0;
                        ta5.e(md4.class, "%s: worker finished; %d workers left", md4Var.a, Integer.valueOf(iDecrementAndGet));
                        return;
                    }
                } catch (Throwable th) {
                    int iDecrementAndGet2 = md4Var.Y.decrementAndGet();
                    if (md4Var.o.isEmpty()) {
                        int i4 = md4.s0;
                        ta5.e(md4.class, "%s: worker finished; %d workers left", md4Var.a, Integer.valueOf(iDecrementAndGet2));
                    } else {
                        md4Var.b();
                    }
                    throw th;
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((k56) this.b).invoke();
                return;
            case 13:
                synchronized (((bg4) this.b).b) {
                    bg4 bg4Var = (bg4) this.b;
                    ArrayList arrayList2 = (ArrayList) bg4Var.X;
                    arrayList = (ArrayList) bg4Var.o;
                    bg4Var.X = arrayList;
                    bg4Var.o = arrayList2;
                }
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((k0) ((ag4) ((ArrayList) ((bg4) this.b).X).get(i5))).n();
                }
                ((ArrayList) ((bg4) this.b).X).clear();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                DialogFragment dialogFragment = (DialogFragment) this.b;
                dialogFragment.o1.onDismiss(dialogFragment.w1);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ll4 ll4Var = (ll4) this.b;
                if (!ll4Var.a.isEmpty()) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int size2 = ll4Var.a.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        il4 il4Var = (il4) ll4Var.a.get(i6);
                        if (il4Var.c < jElapsedRealtime - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                            il4Var.a.getLooper().quit();
                            ll4Var.a.remove(i6);
                            ll4Var.e--;
                            i6--;
                            size2--;
                        }
                        i6++;
                    }
                }
                if (ll4Var.a.isEmpty() && ll4Var.c.isEmpty()) {
                    ll4Var.h = false;
                    return;
                } else {
                    he.e(this, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                    ll4Var.h = true;
                    return;
                }
            case 16:
                ml4 ml4Var = (ml4) this.b;
                if (!ml4Var.a.isEmpty()) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    int i7 = 0;
                    while (i7 < ml4Var.a.size()) {
                        il4 il4Var2 = (il4) ml4Var.a.get(i7);
                        if (il4Var2.c < jElapsedRealtime2 - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                            il4Var2.a.getLooper().quit();
                            ml4Var.a.remove(i7);
                            ml4Var.e--;
                            i7--;
                        }
                        i7++;
                    }
                }
                if (ml4Var.a.isEmpty() && ml4Var.c.isEmpty()) {
                    ml4Var.h = false;
                    return;
                } else {
                    ((ScheduledExecutorService) ((khe) tu0.l.f.b).getValue()).schedule(this, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
                    ml4Var.h = true;
                    return;
                }
            case LangUtils.HASH_SEED /* 17 */:
                es4 es4Var = (es4) this.b;
                es4Var.z0 = null;
                es4Var.drawableStateChanged();
                return;
            case 18:
                ((AtomicBoolean) ((y15) this.b).b).set(true);
                return;
            case 19:
                zb5 zb5Var = (zb5) this.b;
                int i8 = zb5Var.L0;
                ValueAnimator valueAnimator = zb5Var.K0;
                if (i8 == 1) {
                    valueAnimator.cancel();
                } else if (i8 != 2) {
                    return;
                }
                zb5Var.L0 = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 20:
                FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) this.b;
                Context contextD0 = fingerprintDialogFragment.d0();
                if (contextD0 == null) {
                    return;
                }
                fingerprintDialogFragment.D1.h(1);
                fingerprintDialogFragment.D1.g(contextD0.getString(g0c.fingerprint_dialog_touch_sensor));
                return;
            case 21:
                bc7[] bc7VarArr2 = FoldersListScreen.Z;
                FoldersListScreen foldersListScreen = (FoldersListScreen) this.b;
                foldersListScreen.getClass();
                ((RecyclerView) foldersListScreen.Y.T0(foldersListScreen, FoldersListScreen.Z[0])).Y();
                return;
            case 22:
                ax7 ax7Var = (ax7) ((x30) this.b).b;
                cta ctaVar = cta.FOLDERS_INIT_TO_RENDER;
                qi9 qi9Var = ax7Var.e;
                bta btaVar2 = (bta) qi9Var.f(ctaVar);
                if (btaVar2 == null || btaVar2.e != -1 || (btaVar = (bta) qi9Var.f(ctaVar)) == null) {
                    return;
                }
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                btaVar.e = jElapsedRealtime3 - btaVar.b;
                bta btaVar3 = (bta) qi9Var.f(cta.CHATS_INIT_TO_RENDER);
                if (btaVar3 == null || btaVar3.e != -1) {
                    ax7Var.f(jElapsedRealtime3);
                    return;
                }
                return;
            case 23:
                a aVar = (a) this.b;
                if (aVar.X0 != null) {
                    aVar.a0().getClass();
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((c) this.b).A(true);
                return;
            case 25:
                vd8 vd8Var = (vd8) this.b;
                vd8Var.v0 = false;
                vd8Var.E();
                return;
            case 26:
                ((bm7) this.b).cancel(true);
                return;
            case 27:
                vq7 vq7Var = (vq7) this.b;
                if (((yh6) vq7Var.o).a.getAndSet(null) != null) {
                    ((Handler) vq7Var.b).removeCallbacks((yh6) vq7Var.o);
                    return;
                }
                return;
            case 28:
                ((bu6) this.b).requestLayout();
                return;
            default:
                ReentrantReadWriteLock.ReadLock lock = ((v47) this.b).a.i.readLock();
                lock.lock();
                try {
                    try {
                    } finally {
                        lock.unlock();
                        ((v47) this.b).getClass();
                    }
                } catch (SQLiteException unused) {
                    setA = wz4.a;
                } catch (IllegalStateException unused2) {
                    setA = wz4.a;
                }
                if (((v47) this.b).b() && ((v47) this.b).f.compareAndSet(true, false) && !((v47) this.b).a.k()) {
                    k36 writableDatabase = ((v47) this.b).a.h().getWritableDatabase();
                    writableDatabase.n();
                    try {
                        setA = a();
                        writableDatabase.r0();
                        if (!setA.isEmpty()) {
                            v47 v47Var = (v47) this.b;
                            synchronized (v47Var.k) {
                                Iterator it2 = v47Var.k.iterator();
                                while (true) {
                                    nqc nqcVar = (nqc) it2;
                                    if (nqcVar.hasNext()) {
                                        ((t47) ((Map.Entry) nqcVar.next()).getValue()).a(setA);
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } finally {
                        writableDatabase.S();
                    }
                }
                return;
        }
    }

    public /* synthetic */ re(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}

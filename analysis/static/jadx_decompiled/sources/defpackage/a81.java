package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.android.OneMeApplication;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.onechat.reactions.ReactionsViewModel;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class a81 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ a81(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    @Override // defpackage.k56
    public final Object invoke() throws Throwable {
        String[] strArr;
        boolean zB;
        int i = 2;
        int i2 = 0;
        Field field = null;
        ValueAnimator valueAnimator = null;
        switch (this.a) {
            case 0:
                List list = (List) this.c;
                f81 f81Var = (f81) this.b;
                f81Var.x0 = list;
                wj4 wj4Var = (wj4) this.o;
                wj4Var.getClass();
                wj4Var.a(new y8(f81Var));
                return e5f.a;
            case 1:
                eo1 eo1Var = (eo1) this.b;
                gg1 gg1Var = (gg1) this.c;
                String str = (String) this.o;
                yz0 yz0Var = (yz0) ((ez0) eo1Var.d.getValue());
                ir6 ir6Var = hm9.m;
                if (ir6Var != null) {
                    yz0Var.getClass();
                    if (ir6Var.c()) {
                        ir6Var.d(us7.X, "CallAdminSettingsController", "Removing user " + gg1Var + " from call", null);
                    }
                }
                Conversation conversationA = yz0Var.d().a();
                if (conversationA != null) {
                    conversationA.removeParticipant(mqa.d(gg1Var), false);
                }
                kld kldVar = eo1Var.i;
                uj1 uj1Var = wj1.b;
                kldVar.g(new uj1(new gqe(b8a.R0, ys.m0(new Object[]{str})), Integer.valueOf(x7a.A0)));
                return e5f.a;
            case 2:
                return ((ds3) this.b).a.t((List) this.c, (ol3) this.o);
            case 3:
                xe6 xe6Var = (xe6) this.b;
                if (!xe6Var.a()) {
                    return null;
                }
                String str2 = xe6Var.b;
                hm9.n(str2, "Start creating FirebaseApp");
                long jNanoTime = System.nanoTime();
                je7 je7Var = (je7) this.c;
                qyc qycVar = (qyc) ((y7d) je7Var.getValue());
                qycVar.getClass();
                if (qycVar.n(PmsKey.f41fbexecreplace, true)) {
                    qyc qycVar2 = (qyc) ((y7d) je7Var.getValue());
                    qycVar2.getClass();
                    Set stringSet = qycVar2.g.getStringSet(PmsKey.f40fbexecmodifiersnames.name(), null);
                    if (stringSet == null || (strArr = (String[]) stringSet.toArray(new String[0])) == null) {
                        strArr = y7d.b;
                    }
                    hm9.n("ReplaceExecutorRegistrarLogic", "start");
                    int length = strArr.length;
                    while (true) {
                        if (i2 < length) {
                            try {
                                Field declaredField = Field.class.getDeclaredField(strArr[i2]);
                                declaredField.setAccessible(true);
                                field = declaredField;
                            } catch (Throwable unused) {
                                i2++;
                            }
                        }
                    }
                    if (field != null) {
                        Field fieldC = mr0.C(field, "BG_EXECUTOR");
                        je7 je7Var2 = (je7) this.o;
                        if (fieldC != null) {
                            mr0.T(fieldC, new z30(23, je7Var2));
                            hm9.n("ReplaceExecutorRegistrarLogic", "BG_EXECUTOR replaced");
                        }
                        Field fieldC2 = mr0.C(field, "LITE_EXECUTOR");
                        if (fieldC2 != null) {
                            mr0.T(fieldC2, new z30(24, je7Var2));
                            hm9.n("ReplaceExecutorRegistrarLogic", "LITE_EXECUTOR replaced");
                        }
                        Field fieldC3 = mr0.C(field, "BLOCKING_EXECUTOR");
                        if (fieldC3 != null) {
                            mr0.T(fieldC3, new z30(25, je7Var2));
                            hm9.n("ReplaceExecutorRegistrarLogic", "BLOCKING_EXECUTOR replaced");
                        }
                        Field fieldC4 = mr0.C(field, "SCHEDULER");
                        if (fieldC4 != null) {
                            mr0.T(fieldC4, new z30(26, je7Var2));
                            hm9.n("ReplaceExecutorRegistrarLogic", "SCHEDULER replaced");
                        }
                        hm9.n("ReplaceExecutorRegistrarLogic", "finish");
                    }
                }
                fl5 fl5VarE = fl5.e(xe6Var.a);
                int i3 = ft4.o;
                hm9.n(str2, "End creating FirebaseApp. Takes ".concat(ft4.j(z7.S(System.nanoTime() - jNanoTime, kt4.NANOSECONDS))));
                return fl5VarE;
            case 4:
                OneMeApplication oneMeApplication = (OneMeApplication) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                AtomicReference atomicReference = (AtomicReference) this.o;
                int i4 = OneMeApplication.s0;
                q4a q4aVar = new q4a(19);
                jyc jycVar = jyc.a;
                boolean zD = jycVar.d().d();
                if (zD && !atomicBoolean.get()) {
                    long jNanoTime2 = System.nanoTime();
                    q84 q84Var = (q84) dh0.a.getAccessor().c(q84.class);
                    jw3 jw3Var = new jw3(atomicReference, i);
                    q84Var.getClass();
                    oz2 oz2Var = new oz2("all.chat.folder", jw3Var);
                    jycVar.g().b();
                    jh0 jh0Var = (jh0) y8a.a.getAccessor().c(jh0.class);
                    jh0Var.getClass();
                    long jNanoTime3 = System.nanoTime();
                    jh0Var.e = !((eua) jh0Var.a.getValue()).b(eua.f);
                    eua euaVar = (eua) jh0Var.a.getValue();
                    if (Build.VERSION.SDK_INT >= 33) {
                        zB = euaVar.b(eua.k);
                    } else {
                        euaVar.getClass();
                        zB = true;
                    }
                    boolean z = true ^ zB;
                    jh0Var.g = z;
                    if (jh0Var.e || z) {
                        j47.f0(hz4.a, new eh0(jh0Var, oz2Var, null));
                    }
                    ir6 ir6Var2 = hm9.m;
                    if (ir6Var2 != null && ir6Var2.c()) {
                        us7 us7Var = us7.X;
                        int i5 = ft4.o;
                        ir6Var2.d(us7Var, "BannersInitialDataStorage", "load time ".concat(ft4.j(z7.S(System.nanoTime() - jNanoTime3, kt4.NANOSECONDS))), null);
                    }
                    ir6 ir6Var3 = hm9.m;
                    if (ir6Var3 != null && ir6Var3.c()) {
                        us7 us7Var2 = us7.X;
                        int i6 = ft4.o;
                        ir6Var3.d(us7Var2, "InitialDataStorage", "bannersInitialDataStorage.load by ".concat(ft4.j(z7.S(System.nanoTime() - jNanoTime2, kt4.NANOSECONDS))), null);
                    }
                }
                if (((Boolean) atomicReference.get()).booleanValue() || !zD) {
                    hm9.n(oneMeApplication.Y, "LegacyChats: async load");
                    ((w9a) jycVar.s()).b().mo20dispatch(xq9.a, new yh0(6, q4aVar));
                } else {
                    hm9.n(oneMeApplication.Y, "LegacyChats: sync load");
                    q4aVar.invoke();
                }
                return e5f.a;
            case 5:
                qi8 qi8Var = (qi8) this.o;
                return new f8a((je7) this.b, (je7) this.c, qi8Var.o, (ol6) qi8Var.b);
            case 6:
                t6b t6bVar = (t6b) ((u9a) this.b).j.getValue();
                ConcurrentHashMap concurrentHashMap = t6bVar.c;
                cu8 cu8Var = (cu8) this.c;
                Long lValueOf = Long.valueOf(cu8Var.b);
                e52 e52Var = (e52) this.o;
                u6b u6bVar = (u6b) concurrentHashMap.computeIfAbsent(lValueOf, new di(16, new lr1(t6bVar, cu8Var, e52Var, 10)));
                u6bVar.h(e52Var);
                return u6bVar;
            case 7:
                ((k56) this.b).invoke();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                if (valueAnimatorOfFloat != null) {
                    valueAnimatorOfFloat.setDuration(200L);
                    valueAnimatorOfFloat.addUpdateListener(new zf((View) this.o, 4));
                    valueAnimator = valueAnimatorOfFloat;
                }
                ((m1b) this.c).getClass();
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                return e5f.a;
            case 8:
                qqd qqdVar = new qqd(i2, ((nx3) ((je7) this.c).getValue()).limitedParallelism(1, "chat-subscribe"));
                ReactionsViewModel reactionsViewModel = (ReactionsViewModel) this.b;
                return new jr2(reactionsViewModel.b, qqdVar, (je7) this.o, reactionsViewModel.d, reactionsViewModel.c, new b7c(reactionsViewModel, 3));
            case 9:
                return new xh1((Context) ((je7) this.b).getValue(), (wh1) ((lkc) this.c).a.getValue(), (y7d) ((je7) this.o).getValue());
            case 10:
                ((l53) this.b).U0.invoke(new e19((vqd) this.c, ((MessageModel) this.o).a, null));
                return e5f.a;
            case 11:
                ((l53) this.b).U0.invoke(new e19((vqd) this.c, ((MessageModel) this.o).a, null));
                return e5f.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((SuggestionsWidget) ((oce) this.b)).B0().K0.setValue(new lce(((lk3) this.c).getAnchorButton(), (rce) this.o));
                return e5f.a;
            case 13:
                return ((cj0) ((af8) ((cge) this.b).a.g.getValue())).a(((v6f) this.c).a.a, ((it3) this.o).c);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                uu3 uu3Var = (uu3) this.b;
                SwipeWidget swipeWidget = (SwipeWidget) this.c;
                ViewGroup viewGroup = (ViewGroup) this.o;
                int i7 = SwipeWidget.c;
                View view = uu3Var.getView();
                if (view == null) {
                    String str3 = swipeWidget.a;
                    ir6 ir6Var4 = hm9.m;
                    if (ir6Var4 != null && ir6Var4.c()) {
                        ir6Var4.d(us7.X, str3, "getUnderlyingViewProvider: underlying view is null, inflating new one", null);
                    }
                    Method method = (Method) cv3.b.T0(null, cv3.a[0]);
                    if (method == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    view = (View) method.invoke(uu3Var, viewGroup);
                }
                if (view.getParent() == null) {
                    String str4 = swipeWidget.a;
                    ir6 ir6Var5 = hm9.m;
                    if (ir6Var5 != null && ir6Var5.c()) {
                        ir6Var5.d(us7.X, str4, "getUnderlyingViewProvider: underlying view is not attached, adding it to container", null);
                    }
                    viewGroup.addView(view, viewGroup.indexOfChild(viewGroup.findViewById(wwb.swipe_fade)));
                }
                return view;
            default:
                see seeVar = (see) this.b;
                sif sifVar = (sif) this.c;
                eu4 eu4Var = (eu4) this.o;
                Size size = seeVar.b;
                boolean zD2 = seeVar.e.d();
                String str5 = sifVar.a;
                ir6 ir6Var6 = hm9.m;
                if (ir6Var6 != null && ir6Var6.c()) {
                    ir6Var6.d(us7.X, str5, "onInputSurface, surface_request_resolution=" + size + ", dr=" + eu4Var + ", isFrontCamera=" + zD2, null);
                }
                fjf fjfVar = sifVar.u0;
                if (fjfVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                o76.d((AtomicBoolean) fjfVar.c, true);
                o76.c((Thread) fjfVar.e);
                SurfaceTexture surfaceTexture = new SurfaceTexture(fjfVar.b);
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                Surface surface = new Surface(surfaceTexture);
                sifVar.w0++;
                seeVar.c(sifVar.X, new djb(sifVar, 11, eu4Var));
                seeVar.b(surface, sifVar.X, new rif(sifVar, seeVar, surfaceTexture, surface));
                surfaceTexture.setOnFrameAvailableListener(new oif(sifVar, zD2), sifVar.o);
                return e5f.a;
        }
    }
}

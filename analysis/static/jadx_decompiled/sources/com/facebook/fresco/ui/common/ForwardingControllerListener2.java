package com.facebook.fresco.ui.common;

import com.facebook.fresco.ui.common.ControllerListener2;
import defpackage.f06;
import defpackage.m56;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0005\b\u0016\u0018\u0000 +*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\t0\u0007H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0004J+\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00018\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J+\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b&\u0010'R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/facebook/fresco/ui/common/ForwardingControllerListener2;", "I", "Lcom/facebook/fresco/ui/common/a;", "<init>", "()V", "", "methodName", "Lkotlin/Function1;", "Lcom/facebook/fresco/ui/common/ControllerListener2;", "Le5f;", "block", "forEachListener", "(Ljava/lang/String;Lm56;)V", "listener", "addListener", "(Lcom/facebook/fresco/ui/common/ControllerListener2;)V", "removeListener", "removeAllListeners", "id", "", "callerContext", "Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;", "extras", "onSubmit", "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", "imageInfo", "extraData", "onFinalImageSet", "", "throwable", "onFailure", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", "onRelease", "(Ljava/lang/String;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V", "onIntermediateImageSet", "(Ljava/lang/String;Ljava/lang/Object;)V", "onIntermediateImageFailed", "(Ljava/lang/String;)V", "onEmptyEvent", "(Ljava/lang/Object;)V", "", "listeners", "Ljava/util/List;", "Companion", "f06", "ui-common_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public class ForwardingControllerListener2<I> extends a {
    public static final f06 Companion = new f06();
    private static final String TAG = "FwdControllerListener2";
    private final List<ControllerListener2<I>> listeners = new ArrayList(2);

    private final void forEachListener(String methodName, m56 block) {
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    block.invoke(this.listeners.get(i));
                } catch (Exception unused) {
                    new StringBuilder("InternalListener exception in ").append(methodName);
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public final synchronized void addListener(ControllerListener2<I> listener) {
        this.listeners.add(listener);
    }

    @Override // com.facebook.fresco.ui.common.a, com.facebook.fresco.ui.common.ControllerListener2
    public void onEmptyEvent(Object callerContext) {
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    this.listeners.get(i).onEmptyEvent(callerContext);
                } catch (Exception unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.a, com.facebook.fresco.ui.common.ControllerListener2
    public void onFailure(String id, Throwable throwable, ControllerListener2.Extras extras) {
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    this.listeners.get(i).onFailure(id, throwable, extras);
                } catch (Exception unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.a, com.facebook.fresco.ui.common.ControllerListener2
    public void onFinalImageSet(String id, I imageInfo, ControllerListener2.Extras extraData) {
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    this.listeners.get(i).onFinalImageSet(id, imageInfo, extraData);
                } catch (Exception unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.a, com.facebook.fresco.ui.common.ControllerListener2
    public void onIntermediateImageFailed(String id) {
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    this.listeners.get(i).onIntermediateImageFailed(id);
                } catch (Exception unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.a, com.facebook.fresco.ui.common.ControllerListener2
    public void onIntermediateImageSet(String id, I imageInfo) {
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    this.listeners.get(i).onIntermediateImageSet(id, imageInfo);
                } catch (Exception unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.a, com.facebook.fresco.ui.common.ControllerListener2
    public void onRelease(String id, ControllerListener2.Extras extras) {
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    this.listeners.get(i).onRelease(id, extras);
                } catch (Exception unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.a, com.facebook.fresco.ui.common.ControllerListener2
    public void onSubmit(String id, Object callerContext, ControllerListener2.Extras extras) {
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    this.listeners.get(i).onSubmit(id, callerContext, extras);
                } catch (Exception unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                return;
            }
        }
    }

    public final synchronized void removeAllListeners() {
        this.listeners.clear();
    }

    public final synchronized void removeListener(ControllerListener2<I> listener) {
        this.listeners.remove(listener);
    }
}

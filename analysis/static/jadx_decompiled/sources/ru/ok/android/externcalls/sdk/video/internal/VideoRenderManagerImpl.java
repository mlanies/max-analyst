package ru.ok.android.externcalls.sdk.video.internal;

import defpackage.adb;
import defpackage.bg1;
import defpackage.d;
import defpackage.fp1;
import defpackage.k56;
import defpackage.kq7;
import defpackage.oe1;
import defpackage.olf;
import defpackage.oz4;
import defpackage.pg4;
import defpackage.py0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.EglBase;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.renderer.ConversationRenderers;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J/\u0010\u001e\u001a\u001a\u0012\b\u0012\u00060\u001cj\u0002`\u001d\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010\u0018\u001a\u00020\u00132\n\u0010\u000f\u001a\u00060\u001cj\u0002`\u001d2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J/\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u001b2\n\u0010\u001a\u001a\u00060$j\u0002`%H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R`\u0010/\u001aN\u0012\b\u0012\u00060$j\u0002`%\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100-0,j&\u0012\b\u0012\u00060$j\u0002`%\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100-`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/VideoRenderManagerImpl;", "Lru/ok/android/externcalls/sdk/video/VideoRenderManager;", "Lpg4;", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation$State;", "state", "Lpy0;", "call", "Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;", "conversationRenderers", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "<init>", "(Lk56;Lpy0;Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lfp1;", "key", "", "Lorg/webrtc/VideoSink;", "renderers", "Le5f;", "setRenderersForMe", "(Lfp1;Ljava/util/List;)V", "setRenderersForOthers", "value", "setRenderers", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "participantId", "", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "getRenderers", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Ljava/util/Map;", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Ljava/util/List;)V", "", "isEnabled", "()Z", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getRemoteVideoRenderers", "(Lbg1;)Ljava/util/Map;", "Lk56;", "Lpy0;", "Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "cache", "Ljava/util/HashMap;", "Loe1;", "getCallRenderer", "()Loe1;", "callRenderer", "Lorg/webrtc/EglBase$Context;", "getEglBaseContext", "()Lorg/webrtc/EglBase$Context;", "eglBaseContext", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class VideoRenderManagerImpl implements VideoRenderManager, pg4 {
    private final HashMap<bg1, Map<fp1, List<VideoSink>>> cache = new HashMap<>();
    private final py0 call;
    private final ConversationRenderers conversationRenderers;
    private final k56 state;
    private final ParticipantStore store;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[olf.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoRenderManagerImpl(k56 k56Var, py0 py0Var, ConversationRenderers conversationRenderers, ParticipantStore participantStore) {
        this.state = k56Var;
        this.call = py0Var;
        this.conversationRenderers = conversationRenderers;
        this.store = participantStore;
    }

    private final void setRenderersForMe(fp1 key, List<? extends VideoSink> renderers) {
        int iOrdinal = key.a.ordinal();
        if (iOrdinal == 0) {
            py0 py0Var = this.call;
            VideoSink videoSink = (renderers == null || renderers.isEmpty()) ? null : renderers.get(0);
            if (py0Var.i()) {
                d dVar = py0Var.l1;
                dVar.A0 = videoSink;
                kq7 kq7Var = dVar.z0;
                if (kq7Var != null) {
                    kq7Var.k(videoSink);
                    return;
                }
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3 && iOrdinal != 4) {
                    throw new RuntimeException("Unknown track type");
                }
                setRenderers(key, renderers);
                py0 py0Var2 = this.call;
                if (py0Var2.i()) {
                    py0Var2.t1.R(key, renderers);
                    py0Var2.E1.getClass();
                    return;
                }
                return;
            }
            py0 py0Var3 = this.call;
            bg1 bg1Var = py0Var3.p1.a.a;
            if (bg1Var == null) {
                return;
            }
            adb adbVar = new adb(3);
            adbVar.a = bg1Var;
            adbVar.b = olf.c;
            adbVar.c();
            py0Var3.E1.getClass();
        }
    }

    private final void setRenderersForOthers(fp1 key, List<? extends VideoSink> renderers) {
        setRenderers(key, renderers);
        py0 py0Var = this.call;
        if (py0Var.i()) {
            py0Var.t1.R(key, renderers);
            py0Var.E1.getClass();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.VideoRenderManager
    public oe1 getCallRenderer() {
        if (this.state.invoke() != Conversation.State.Finished) {
            return this.call.y0;
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.video.VideoRenderManager
    public EglBase.Context getEglBaseContext() {
        if (this.call.x0 == null || this.state.invoke() == Conversation.State.Finished) {
            return null;
        }
        return this.call.x0.getEglBaseContext();
    }

    @Override // defpackage.pg4
    public Map<fp1, List<VideoSink>> getRemoteVideoRenderers(bg1 participantId) {
        Map<fp1, List<VideoSink>> map = this.cache.get(participantId);
        return map == null ? oz4.a : map;
    }

    @Override // ru.ok.android.externcalls.sdk.video.VideoRenderManager
    public Map<ConversationVideoTrackParticipantKey, List<VideoSink>> getRenderers(ParticipantId participantId) {
        return this.conversationRenderers.getRenderers(participantId);
    }

    @Override // defpackage.pg4
    public boolean isEnabled() {
        return true;
    }

    @Override // ru.ok.android.externcalls.sdk.video.VideoRenderManager
    public void setRenderers(ConversationVideoTrackParticipantKey key, List<? extends VideoSink> renderers) {
        ConversationParticipant conversationParticipant = this.store.get(key.getParticipantId());
        if (conversationParticipant == null || !conversationParticipant.isUseable()) {
            return;
        }
        adb adbVar = new adb(3);
        adbVar.b = key.getType();
        adbVar.a = conversationParticipant.getCallParticipant().a;
        adbVar.c = key.getMovieId();
        fp1 fp1VarC = adbVar.c();
        this.conversationRenderers.setRenderers(key, renderers);
        if (conversationParticipant == this.store.getMe()) {
            setRenderersForMe(fp1VarC, renderers);
        } else {
            setRenderersForOthers(fp1VarC, renderers);
        }
    }

    private final void setRenderers(fp1 key, List<? extends VideoSink> value) {
        HashMap<bg1, Map<fp1, List<VideoSink>>> map = this.cache;
        bg1 bg1Var = key.b;
        Map<fp1, List<VideoSink>> map2 = map.get(bg1Var);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(bg1Var, map2);
        }
        map2.put(key, value);
    }
}

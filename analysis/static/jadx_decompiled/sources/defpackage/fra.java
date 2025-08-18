package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.RendererCommon;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.VideoRender;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;

/* loaded from: classes.dex */
public final class fra implements era {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final VideoRender o = new VideoRender();
    public final ConcurrentHashMap.KeySetView X = ConcurrentHashMap.newKeySet();

    public fra(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var3;
        this.b = je7Var;
        this.c = je7Var2;
    }

    public final Conversation c() {
        return ((fw3) this.b.getValue()).a();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void clear() {
        ConcurrentHashMap.KeySetView keySetView = this.X;
        Iterator it = keySetView.iterator();
        while (it.hasNext()) {
            ip1 ip1Var = (ip1) ((dra) it.next());
            ip1Var.c();
            ip1Var.t0 = null;
            ip1Var.u0 = false;
        }
        this.o.clear();
        keySetView.clear();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    /* renamed from: createVideoViewInstance */
    public final RendererView mo122createVideoViewInstance(Context context) {
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context, null, 0, 6, null);
        textureViewRenderer.setId(View.generateViewId());
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL, RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        return textureViewRenderer;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void removeParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, TextureViewRenderer textureViewRenderer) {
        Conversation conversationC = c();
        if (conversationC != null) {
            VideoRender videoRender = this.o;
            if (videoRender.contains(conversationVideoTrackParticipantKey, textureViewRenderer)) {
                videoRender.removeDelegate(conversationVideoTrackParticipantKey, textureViewRenderer);
                textureViewRenderer.clearImage();
                ConversationParticipant conversationParticipant = conversationC.getParticipants().get(conversationVideoTrackParticipantKey.getParticipantId());
                if (conversationParticipant == null || !conversationParticipant.isUseable()) {
                    return;
                }
                conversationC.getVideoRenderManager().setRenderers(conversationVideoTrackParticipantKey, videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final ConversationVideoTrackParticipantKey getOwnVideoTrack() {
        Conversation conversationC = c();
        if (conversationC != null) {
            return new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationC.getMe().getExternalId()).build();
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCameraChanged() {
        TextureViewRenderer textureViewRenderer;
        for (dra draVar : this.X) {
            boolean zB = ((r21) this.a.getValue()).b();
            ip1 ip1Var = (ip1) draVar;
            llf llfVar = ip1Var.v0;
            if (llfVar != null && llfVar.c && (textureViewRenderer = ip1Var.c) != null) {
                textureViewRenderer.setMirror(zB);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void rebindParticipantViews() {
        Conversation conversationC = c();
        if (conversationC == null) {
            return;
        }
        for (ConversationParticipant conversationParticipant : conversationC.getParticipants()) {
            VideoRenderManager videoRenderManager = conversationC.getVideoRenderManager();
            if (conversationParticipant.isUseable()) {
                for (ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey : videoRenderManager.getRenderers(conversationParticipant.getExternalId()).keySet()) {
                    videoRenderManager.setRenderers(conversationVideoTrackParticipantKey, this.o.asOkVideoSink(conversationVideoTrackParticipantKey));
                }
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void releaseParticipantView(RendererView rendererView) {
        ((TextureViewRenderer) rendererView).release();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void removeOwnVideoParticipantView(RendererView rendererView) {
        removeParticipantView(((cra) ((oqa) this.c.getValue())).c().a.s().b, (TextureViewRenderer) rendererView);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void setOwnVideoParticipantView(RendererView rendererView, FrameDecorator frameDecorator) {
        setParticipantView(((cra) ((oqa) this.c.getValue())).c().a.s().b, (TextureViewRenderer) rendererView);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, RendererView rendererView, FrameDecorator frameDecorator) {
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) rendererView;
        Conversation conversationC = c();
        if (conversationC == null || conversationVideoTrackParticipantKey == null) {
            return;
        }
        VideoRender videoRender = this.o;
        if (videoRender.contains(conversationVideoTrackParticipantKey, textureViewRenderer)) {
            return;
        }
        videoRender.addDelegate(conversationVideoTrackParticipantKey, textureViewRenderer);
        textureViewRenderer.setMirror(tpa.f(conversationC.getMe().getExternalId(), conversationVideoTrackParticipantKey.getParticipantId()) && conversationVideoTrackParticipantKey.getType() == olf.a && ((r21) this.a.getValue()).b());
        VideoRenderManager videoRenderManager = conversationC.getVideoRenderManager();
        videoRenderManager.setRenderers(conversationVideoTrackParticipantKey, videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
        oe1 callRenderer = videoRenderManager.getCallRenderer();
        if (callRenderer != null) {
            RendererView.init$default(textureViewRenderer, callRenderer, null, null, 4, null);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void updateDisplayLayout(Collection collection) {
        Conversation conversationC = c();
        DisplayLayoutSender displayLayoutSender = conversationC != null ? conversationC.getDisplayLayoutSender() : null;
        if (displayLayoutSender != null) {
            displayLayoutSender.sendDisplayLayouts(collection);
        }
    }
}

package ru.ok.android.externcalls.sdk.video.internal;

import android.content.Context;
import android.view.View;
import defpackage.k56;
import defpackage.m56;
import defpackage.oe1;
import defpackage.olf;
import defpackage.tpa;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager;
import ru.ok.android.externcalls.sdk.video.VideoRender;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0010\b\u0000\u0010\u0004*\u00020\u0001*\u00020\u0002*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B9\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\f*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020\f2\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\f2\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\f2\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010)J\u000f\u0010*\u001a\u00020\fH\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u0010\u001dR\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00109\u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/ParticipantVideoViewManagerImpl;", "Landroid/view/View;", "Lorg/webrtc/VideoSink;", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "R", "Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager;", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation;", "conversation", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Le5f;", "onOwnCameraRendererSet", "<init>", "(Lk56;Lm56;Lk56;)V", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participant", "rebindParticipantView", "(Lru/ok/android/externcalls/sdk/Conversation;Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "context", "createVideoViewInstance", "(Landroid/content/Context;)Landroid/view/View;", "renderView", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "decorator", "setOwnVideoParticipantView", "(Landroid/view/View;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "removeOwnVideoParticipantView", "(Landroid/view/View;)V", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "key", "setParticipantView", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Landroid/view/View;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "removeParticipantView", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Landroid/view/View;)V", "", "isMirror", "setMirror", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Z)V", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "rebindParticipantViews", "()V", "", "Lru/ok/android/externcalls/sdk/layout/ConversationDisplayLayoutItem;", "displayLayouts", "updateDisplayLayout", "(Ljava/util/Collection;)V", "releaseParticipantView", "Lk56;", "Lm56;", "Lru/ok/android/externcalls/sdk/video/VideoRender;", "videoRender", "Lru/ok/android/externcalls/sdk/video/VideoRender;", "getOwnVideoTrack", "()Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "ownVideoTrack", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ParticipantVideoViewManagerImpl<R extends View & VideoSink & RendererView> implements ParticipantVideoViewManager<R> {
    private final k56 conversation;
    private final m56 factory;
    private final k56 onOwnCameraRendererSet;
    private final VideoRender<R> videoRender = new VideoRender<>();

    public ParticipantVideoViewManagerImpl(k56 k56Var, m56 m56Var, k56 k56Var2) {
        this.conversation = k56Var;
        this.factory = m56Var;
        this.onOwnCameraRendererSet = k56Var2;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    /* renamed from: createVideoViewInstance, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ RendererView mo122createVideoViewInstance(Context context) {
        return (RendererView) createVideoViewInstance(context);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public ConversationVideoTrackParticipantKey getOwnVideoTrack() {
        Conversation conversation = (Conversation) this.conversation.invoke();
        if (conversation != null) {
            return new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversation.getMe().getExternalId()).build();
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void rebindParticipantView(ConversationParticipant participant) {
        Conversation conversation = (Conversation) this.conversation.invoke();
        if (conversation != null) {
            rebindParticipantView(conversation, participant);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void rebindParticipantViews() {
        Conversation conversation = (Conversation) this.conversation.invoke();
        if (conversation != null && conversation.getState() == Conversation.State.Connected) {
            Iterator<ConversationParticipant> it = conversation.getParticipants().iterator();
            while (it.hasNext()) {
                rebindParticipantView(conversation, it.next());
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void setMirror(ConversationVideoTrackParticipantKey key, boolean isMirror) {
        this.videoRender.setMirror(key, isMirror);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void updateDisplayLayout(Collection<ConversationDisplayLayoutItem> displayLayouts) {
        DisplayLayoutSender displayLayoutSender;
        Conversation conversation = (Conversation) this.conversation.invoke();
        if (conversation == null || (displayLayoutSender = conversation.getDisplayLayoutSender()) == null) {
            return;
        }
        displayLayoutSender.sendDisplayLayouts(displayLayouts);
    }

    private final void rebindParticipantView(Conversation conversation, ConversationParticipant conversationParticipant) {
        if (conversationParticipant.isUseable()) {
            for (ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey : conversation.getVideoRenderManager().getRenderers(conversationParticipant.getExternalId()).keySet()) {
                conversation.getVideoRenderManager().setRenderers(conversationVideoTrackParticipantKey, this.videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
            }
        }
    }

    public R createVideoViewInstance(Context context) {
        return (R) ((View) this.factory.invoke(context));
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void releaseParticipantView(R renderView) {
        renderView.release();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void removeOwnVideoParticipantView(R renderView) {
        ConversationVideoTrackParticipantKey ownVideoTrack = getOwnVideoTrack();
        if (ownVideoTrack != null) {
            removeParticipantView(ownVideoTrack, (ConversationVideoTrackParticipantKey) renderView);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void removeParticipantView(ConversationVideoTrackParticipantKey key, R renderView) {
        ConversationParticipant conversationParticipant;
        Conversation conversation = (Conversation) this.conversation.invoke();
        R r = renderView;
        if (this.videoRender.contains(key, r)) {
            this.videoRender.removeDelegate(key, r);
            if (conversation == null || (conversationParticipant = conversation.getParticipants().get(key.getParticipantId())) == null || !conversationParticipant.isUseable()) {
                return;
            }
            conversation.getVideoRenderManager().setRenderers(key, this.videoRender.asOkVideoSink(key));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void setOwnVideoParticipantView(R renderView, FrameDecorator decorator) {
        setParticipantView(getOwnVideoTrack(), renderView);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void setParticipantView(ConversationVideoTrackParticipantKey key, R renderView, FrameDecorator decorator) {
        ParticipantId participantId;
        ConversationParticipant conversationParticipant;
        Conversation conversation = (Conversation) this.conversation.invoke();
        if (conversation == null || conversation.getState() != Conversation.State.Connected || key == null) {
            return;
        }
        R r = renderView;
        if (this.videoRender.contains(key, r) || (conversationParticipant = conversation.getParticipants().get((participantId = key.getParticipantId()))) == null || !conversationParticipant.isUseable()) {
            return;
        }
        this.videoRender.addDelegate(key, r);
        if (tpa.f(conversation.getMe().getExternalId(), participantId) && key.getType() == olf.a) {
            this.onOwnCameraRendererSet.invoke();
        } else {
            renderView.setMirror(false);
        }
        conversation.getVideoRenderManager().setRenderers(key, this.videoRender.asOkVideoSink(key));
        oe1 callRenderer = conversation.getVideoRenderManager().getCallRenderer();
        if (callRenderer != null) {
            renderView.init(callRenderer, null, decorator);
        }
    }
}

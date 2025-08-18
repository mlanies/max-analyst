package ru.ok.android.externcalls.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import defpackage.a25;
import defpackage.a4c;
import defpackage.ag1;
import defpackage.aq7;
import defpackage.b4c;
import defpackage.bg1;
import defpackage.bi;
import defpackage.bnd;
import defpackage.c71;
import defpackage.ce;
import defpackage.d4a;
import defpackage.d4c;
import defpackage.dg1;
import defpackage.die;
import defpackage.drd;
import defpackage.e0e;
import defpackage.e5;
import defpackage.e5f;
import defpackage.ece;
import defpackage.eg1;
import defpackage.erf;
import defpackage.es3;
import defpackage.ey0;
import defpackage.f46;
import defpackage.fg1;
import defpackage.flc;
import defpackage.gi6;
import defpackage.gk3;
import defpackage.gw3;
import defpackage.gy9;
import defpackage.hc3;
import defpackage.hi6;
import defpackage.hrf;
import defpackage.hw3;
import defpackage.i77;
import defpackage.i7b;
import defpackage.id1;
import defpackage.ig5;
import defpackage.ii6;
import defpackage.iq1;
import defpackage.iqd;
import defpackage.iw3;
import defpackage.jb9;
import defpackage.jg1;
import defpackage.ji6;
import defpackage.ji9;
import defpackage.jra;
import defpackage.jw3;
import defpackage.jy2;
import defpackage.k56;
import defpackage.ka6;
import defpackage.kd9;
import defpackage.ke1;
import defpackage.kg1;
import defpackage.kl;
import defpackage.kq7;
import defpackage.l60;
import defpackage.ly0;
import defpackage.m56;
import defpackage.md9;
import defpackage.muc;
import defpackage.my0;
import defpackage.nd9;
import defpackage.nh1;
import defpackage.nj3;
import defpackage.nsa;
import defpackage.o61;
import defpackage.old;
import defpackage.oy0;
import defpackage.pg4;
import defpackage.pld;
import defpackage.py0;
import defpackage.q2a;
import defpackage.qj3;
import defpackage.qld;
import defpackage.qod;
import defpackage.qpc;
import defpackage.qz7;
import defpackage.rh;
import defpackage.rj3;
import defpackage.rk0;
import defpackage.rod;
import defpackage.rx1;
import defpackage.s04;
import defpackage.sk0;
import defpackage.tad;
import defpackage.tb2;
import defpackage.tu0;
import defpackage.tv1;
import defpackage.u2a;
import defpackage.uoa;
import defpackage.v02;
import defpackage.vi9;
import defpackage.vte;
import defpackage.vx0;
import defpackage.w51;
import defpackage.wi9;
import defpackage.wk8;
import defpackage.wte;
import defpackage.x61;
import defpackage.xxe;
import defpackage.y61;
import defpackage.yad;
import defpackage.yv3;
import defpackage.za3;
import defpackage.zad;
import defpackage.zl4;
import defpackage.zx0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.PeerConnection;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.api.ChatHistoryEntry;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.ExternApiException;
import ru.ok.android.externcalls.sdk.api.InternalIdResponse;
import ru.ok.android.externcalls.sdk.api.JoinByIdResponse;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.UnwrappingParser;
import ru.ok.android.externcalls.sdk.api.extern.ExternErrorParser;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.asr.AsrManager;
import ru.ok.android.externcalls.sdk.asr.internal.AsrManagerImpl;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.AsrOnlineManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManagerImpl;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.audio.internal.MicrophoneManagerImpl;
import ru.ok.android.externcalls.sdk.audio.internal.NoiseSuppressionManagerImpl;
import ru.ok.android.externcalls.sdk.capabilities.SignalingCapabilities;
import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.chat.internal.ChatManagerImpl;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManagerImpl;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionManager;
import ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import ru.ok.android.externcalls.sdk.contacts.internal.ContactCallManagerImpl;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Action;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionResult;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.dev.internal.DebugManagerImpl;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.HangupHint;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerImpl;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListenersImpl;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.feedback.internal.FeedbackManagerImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.IdUtils;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.mapping.ExternalToInternalIdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.InternalToExternalIdsMapper;
import ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.MediaMuteManagerImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManagerImpl;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;
import ru.ok.android.externcalls.sdk.net.internal.NetworkConnectionManagerImpl;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;
import ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStateChanger;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.rate.RateManager;
import ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.externcalls.sdk.renderer.ConversationRenderers;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.SessionRoomsManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantStatesHandler;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;
import ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.UrlSharingManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt;
import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;
import ru.ok.android.externcalls.sdk.video.internal.CameraManagerImpl;
import ru.ok.android.externcalls.sdk.video.internal.DisplayLayoutSenderImpl;
import ru.ok.android.externcalls.sdk.video.internal.ScreenCaptureManagerImpl;
import ru.ok.android.externcalls.sdk.video.internal.VideoRenderManagerImpl;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.internal.WatchTogetherPlayerImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom.SessionRoomWatchTogetherHandler;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
class ConversationImpl implements Conversation {
    private static final float AUDIO_LEVEL_CLAMP_MAX = 10000.0f;
    private static final float AUDIO_LEVEL_MIN = 1000.0f;
    private static final String LOG_TAG = "Conversation";
    private final AddParticipantsCommands addParticipantsCommands;
    private final bi animojiDataSupplier;
    private String anonToken;
    private final q2a api;
    private final OkApiService apiService;
    private final AsrListenerManagerImpl asrListenerManager;
    private final AsrManager asrManager;
    private final AsrOnlineManagerImpl asrOnlineManager;
    private final int audioLevelFrequencyMs;
    private final AudioSampleEnergyCalculator audioSampleEnergyCalculator;
    private boolean audioSampleEnergyCalculatorRegistered;
    private final py0 call;
    private CallInfo callInfo;
    private final ag1 callParams;
    private final Runnable callParticipantResolutionRunnable;
    private final CameraManager cameraManager;
    private final ChatListenerManagerImpl chatListenerManager;
    private final ChatManagerImpl chatManager;
    private final ChatStateListener chatStateListener;
    private final gw3 cidProvider;
    private final ContactCallManagerImpl contactCallManager;
    private final ConversationFeatureListenersImpl conversationFeatureListeners;
    private final ConversationFeatureManagerImpl conversationFeatureManager;
    private ConversationParams conversationParams;
    private final ConversationStats conversationStats;
    private final ConversationFactory creator;
    private final DebugManager debugManager;
    private final DisplayLayoutSender displayLayoutSender;
    private final hc3 disposable;
    private final MultiEventListener eventListener;
    private final ExecutorService executorService;
    private boolean expectedChat;
    private final ExternalIdsResolver externalIdsResolver;
    private final FeedbackListenerManagerImpl feedbackListenerManager;
    private final FeedbackManager feedbackManager;
    private boolean forceRelayPolicy;
    private final boolean hotStart;
    private final IdMappingWrapper idMappingWrapper;
    private volatile boolean inited;
    private final String initialJoinLink;
    private ConversationParticipant initialOpponent;
    private final IdsMapper<ParticipantId, bg1> internalIdsMapper;
    private final InternalIdsResolver internalIdsResolver;
    private final boolean isAnswer;
    private final boolean isCaller;
    private boolean isConcurrent;
    private boolean isConcurrentByApi;
    private final ListenerImpl listener;
    private final LocalIdMappings localIdMappings;
    private final Locale locale;
    private final a4c log;
    private final b4c logConfiguration;
    private final Handler mainThreadHandler;

    /* renamed from: me, reason: collision with root package name */
    private final ConversationParticipant f144me;
    private final MediaConnectionManagerImpl mediaConnectionManager;
    private final MediaMuteListenerManagerImpl mediaMuteListenerManager;
    private final MediaMuteManagerImpl mediaMuteManager;
    private final MicrophoneManager microphoneManager;
    private final NetworkConnectionManager networkConnectionManager;
    private final NoiseSuppressionManager noiseSuppressionManager;
    private final ParticipantStatesManagerImpl participantStatesManager;
    private final ParticipantsUpdater participantsUpdater;
    private final PeerIdGenerator peerIdGenerator;
    private final i7b preferencesHelper;
    private volatile boolean prepared;
    private final RateManagerImpl rateManager;
    private final RecordManagerImpl recordManager;
    private final ScreenCaptureManager screenCaptureManager;
    private final SessionRoomsManagerImpl sessionRoomManager;
    private final SessionRoomParticipantStatesHandler sessionRoomParticipantStatesHandler;
    private final SessionRoomWatchTogetherHandler sessionRoomWatchTogetherHandler;
    private hrf signalingTransport;
    private final StartCallApiParams startCallApiParams;
    private final ExtLogger stat;
    private final AtomicReference<Conversation.State> state;
    private final Object stateTransitionLock = new Object();
    private final StereoRoomManagerImpl stereoRoomManager;
    private final ParticipantStore store;
    private final UrlSharingListenerManagerImpl urlSharingListenerManager;
    private final UrlSharingManagerImpl urlSharingManager;
    private final String version;
    private final VideoRenderManager videoRenderManager;
    private final pg4 videoRendererProvider;
    private final WaitingRoomParticipants waitingRoomParticipants;
    private volatile boolean wantsApiHangup;
    private volatile boolean wasHungUp;
    private final WatchTogetherListenerManagerImpl watchTogetherListenerManager;
    private final WatchTogetherPlayer watchTogetherPlayer;

    /* renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$1, reason: invalid class name */
    public class AnonymousClass1 extends AudioSampleEnergyCalculator {
        public AnonymousClass1(Handler handler) {
            super(handler);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onSample$0() {
            if (ConversationImpl.this.listener.listener == null || ConversationImpl.this.call.t1.H(xxe.c)) {
                return;
            }
            ConversationImpl.this.updateTalkingParticipants();
        }

        @Override // ru.ok.android.externcalls.sdk.AudioSampleEnergyCalculator, defpackage.z99
        public void onSample(int i, int i2, int i3, uoa uoaVar) {
            super.onSample(i, i2, i3, uoaVar);
            ConversationImpl.this.mainThreadHandler.post(new n(5, this));
        }
    }

    /* renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$ru$ok$android$webrtc$CallEvents;

        static {
            int[] iArr = new int[w51.values().length];
            $SwitchMap$ru$ok$android$webrtc$CallEvents = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[13] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[18] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[9] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[0] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[12] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[7] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[8] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[19] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[20] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[22] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[23] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[24] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[27] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[25] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[26] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[11] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[16] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[17] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[28] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[32] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[29] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[30] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[31] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[35] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[36] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[37] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[38] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[39] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[40] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[14] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[15] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[21] = 39;
            } catch (NoSuchFieldError unused39) {
            }
        }
    }

    public class ListenerImpl implements my0, ly0, c71, ke1, jg1, WaitingRoomParticipants.Listener, bnd {
        private boolean callAcceptedFired;
        private boolean callAcceptedForwarded;
        private ConversationEventsListener listener;

        public ListenerImpl(ConversationEventsListener conversationEventsListener) {
            this.listener = conversationEventsListener;
        }

        private void handleMuteParticipant(wi9 wi9Var) {
            boolean z = wi9Var.b;
            vi9 vi9Var = wi9Var.a;
            if (!z || !ConversationImpl.this.isMeCreatorOrAdmin()) {
                this.listener.onMuteChanged(vi9Var);
            }
            ConversationImpl.this.mediaMuteListenerManager.onMuteChanged(vi9Var);
        }

        private void handleRolesChanged(fg1 fg1Var) {
            o61 o61Var;
            ParticipantId participantIdConvert;
            bg1 bg1Var = fg1Var.a;
            ConversationParticipant byInternal = bg1Var != null ? ConversationImpl.this.store.getByInternal(bg1Var) : null;
            if (byInternal == null && ConversationImpl.this.callParams.B.j && (o61Var = fg1Var.p) != null && (participantIdConvert = CallExternalIdConverter.convert(o61Var)) != null) {
                byInternal = ConversationImpl.this.store.getParticipantById(participantIdConvert);
            }
            if (byInternal != null) {
                if (byInternal.getCallParticipant() == null) {
                    byInternal.setCallParticipant(fg1Var, ConversationImpl.this.localIdMappings);
                }
                ConversationEventsListener conversationEventsListener = this.listener;
                if (conversationEventsListener != null) {
                    conversationEventsListener.onRolesChanged(byInternal);
                }
                if ((ConversationImpl.this.f144me.getInternalId() == null || !ConversationImpl.this.f144me.getInternalId().equals(fg1Var.a)) && !(ConversationImpl.this.callParams.B.j && byInternal == ConversationImpl.this.f144me)) {
                    return;
                }
                ConversationImpl.this.waitingRoomParticipants.onIsMeAdminMayHaveChanged(ConversationImpl.this.isMeCreatorOrAdmin());
            }
        }

        @Override // defpackage.c71
        public void onCallParticipantFingerprint(fg1 fg1Var, long j) {
            fg1 fg1Var2;
            ConversationEventsListener conversationEventsListener;
            if (ConversationImpl.this.call.p1.i().size() == 1) {
                kg1 kg1Var = ConversationImpl.this.call.p1;
                int iR = kg1Var.r();
                if (iR == 0) {
                    fg1Var2 = null;
                } else {
                    if (iR != 1) {
                        throw new RuntimeException("group call");
                    }
                    fg1Var2 = (fg1) kg1Var.i().iterator().next();
                }
                if (fg1Var2 != fg1Var || (conversationEventsListener = this.listener) == null) {
                    return;
                }
                conversationEventsListener.onOpponentFingerprintChanged(j);
            }
        }

        @Override // defpackage.ke1
        public void onCallParticipantNetworkStatusChanged(List<fg1> list) {
            ConversationParticipant byInternal;
            ArrayList arrayList = new ArrayList();
            for (fg1 fg1Var : list) {
                bg1 bg1Var = fg1Var.a;
                if (bg1Var != null && (byInternal = ConversationImpl.this.store.getByInternal(bg1Var)) != null) {
                    if (byInternal.getCallParticipant() == null) {
                        byInternal.setCallParticipant(fg1Var, ConversationImpl.this.localIdMappings);
                    }
                    if (ConversationImpl.this.store.getParticipantRoomId(byInternal) == ConversationImpl.this.store.getActiveRoomId()) {
                        arrayList.add(byInternal);
                    }
                }
            }
            if (this.listener == null || arrayList.isEmpty()) {
                return;
            }
            this.listener.onCallParticipantsNetworkStatusChanged(arrayList);
        }

        @Override // defpackage.ly0
        public void onCustomData(bg1 bg1Var, JSONObject jSONObject) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onCustomData(jSONObject);
            }
        }

        @Override // defpackage.my0
        public void onEvent(py0 py0Var, w51 w51Var, Object obj) {
            ConversationImpl.this.log.log(ConversationImpl.LOG_TAG, "EVENT: " + w51Var);
            if (this.listener != null) {
                switch (w51Var.ordinal()) {
                    case 0:
                        ConversationImpl.this.mediaConnectionManager.onIceConnected();
                        ConversationImpl.this.conversationStats.reconnectStat.onConnected();
                        this.listener.onConnected();
                        if (!ConversationImpl.this.audioSampleEnergyCalculatorRegistered) {
                            ConversationImpl.this.audioSampleEnergyCalculatorRegistered = true;
                            AudioSampleEnergyCalculator audioSampleEnergyCalculator = ConversationImpl.this.audioSampleEnergyCalculator;
                            long j = ConversationImpl.this.audioLevelFrequencyMs;
                            qld qldVar = py0Var.k1;
                            qldVar.getClass();
                            qldVar.a.execute(new tb2(qldVar, audioSampleEnergyCalculator, j, 6));
                            break;
                        }
                        break;
                    case 1:
                        ConversationImpl.this.mediaConnectionManager.onIceDisconnected();
                        ConversationImpl.this.conversationStats.reconnectStat.onDisconnected();
                        this.listener.onDisconnected();
                        break;
                    case 2:
                    case 13:
                        this.listener.onCallEnded(ConversationImpl.this.getCallEndInfo(py0Var.Q0, obj));
                        ConversationEventsListener conversationEventsListener = this.listener;
                        ConversationEndReason conversationEndReason = (ConversationEndReason) py0Var.k2.c;
                        if (conversationEndReason == null) {
                            conversationEndReason = ConversationEndReason.Unknown.INSTANCE;
                        }
                        conversationEventsListener.onCallEnded(new ConversationEndInfo(conversationEndReason));
                        break;
                    case 3:
                        this.listener.onCallEnded(new ConversationEventsListener.CallEndInfo(ji6.X, Collections.emptySet(), null));
                        py0Var.k2.E(ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE);
                        ConversationEventsListener conversationEventsListener2 = this.listener;
                        ConversationEndReason conversationEndReason2 = (ConversationEndReason) py0Var.k2.c;
                        if (conversationEndReason2 == null) {
                            conversationEndReason2 = ConversationEndReason.Unknown.INSTANCE;
                        }
                        conversationEventsListener2.onCallEnded(new ConversationEndInfo(conversationEndReason2));
                        break;
                    case 4:
                        this.listener.onLocalMediaChanged();
                        break;
                    case 5:
                        this.listener.onOpponentMediaChanged();
                        break;
                    case 6:
                        this.listener.onCameraChanged();
                        break;
                    case 7:
                        this.listener.onDestroyed(ConversationImpl.this.getDestroyReason());
                        ConversationEventsListener conversationEventsListener3 = this.listener;
                        ConversationEndReason conversationEndReason3 = (ConversationEndReason) py0Var.k2.c;
                        if (conversationEndReason3 == null) {
                            conversationEndReason3 = ConversationEndReason.Unknown.INSTANCE;
                        }
                        conversationEventsListener3.onDestroyed(new ConversationDestroyedInfo(conversationEndReason3));
                        ConversationImpl.this.idMappingWrapper.scheduleWriteCacheToDisk();
                        break;
                    case 8:
                        ConversationImpl.this.resetSignaling();
                        break;
                    case 9:
                        if (!this.callAcceptedForwarded && (!ConversationImpl.this.isCaller || this.callAcceptedFired)) {
                            this.listener.onCallAccepted();
                            this.callAcceptedForwarded = true;
                        }
                        this.callAcceptedFired = true;
                        this.listener.onCallAcceptedForAll();
                        break;
                    case 10:
                        this.listener.onOpponentRegistered();
                        break;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        this.listener.onCameraBusy();
                        break;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        if (obj instanceof x61) {
                            ConversationImpl.this.conversationFeatureListeners.onFeatureSetChanged((x61) obj);
                            break;
                        }
                        break;
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        if (obj instanceof y61) {
                            ConversationImpl.this.conversationFeatureListeners.onFeaturesPerRoleChanged((y61) obj);
                            break;
                        }
                        break;
                    case 16:
                        if ((obj instanceof Long) && ConversationImpl.this.chatStateListener != null) {
                            ConversationImpl.this.chatStateListener.onChatCreated(((Long) obj).longValue());
                            break;
                        }
                        break;
                    case LangUtils.HASH_SEED /* 17 */:
                        if ((obj instanceof Long) && ConversationImpl.this.chatStateListener != null) {
                            ConversationImpl.this.chatStateListener.onChatUpdated(((Long) obj).longValue());
                            break;
                        }
                        break;
                    case 18:
                        this.listener.onMicrophoneForciblyMuted();
                        break;
                    case 19:
                        py0Var.E(true);
                        this.listener.onMicChanged(true);
                        break;
                    case 20:
                        py0Var.E(false);
                        this.listener.onMicChanged(false);
                        break;
                    case 21:
                        if (obj instanceof SignalingErrors$CallIsUnfeasibleError) {
                            this.listener.onCallIsUnfeasibleError((SignalingErrors$CallIsUnfeasibleError) obj);
                            break;
                        }
                        break;
                    case 22:
                        this.listener.onCallSignalingConnected();
                        break;
                    case 23:
                        if (obj instanceof fg1) {
                            handleRolesChanged((fg1) obj);
                            break;
                        }
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        if (obj instanceof Set) {
                            Iterator it = ((Set) obj).iterator();
                            while (it.hasNext()) {
                                handleRolesChanged((fg1) it.next());
                            }
                            break;
                        }
                        break;
                    case 25:
                    case 26:
                        bg1 bg1Var = obj instanceof bg1 ? (bg1) obj : null;
                        this.listener.onPinChanged(bg1Var != null ? ConversationImpl.this.store.getByInternal(bg1Var) : null, w51Var == w51.J0);
                        break;
                    case 27:
                        if (obj instanceof wi9) {
                            handleMuteParticipant((wi9) obj);
                            break;
                        }
                        break;
                    case 28:
                        this.listener.onAnonJoinForbiddenChanged(ConversationImpl.this.isAnonJoinForbidden());
                        break;
                    case 29:
                        this.listener.onRecurringChanged(ConversationImpl.this.isRecurring());
                        break;
                    case 30:
                        ConversationImpl.this.feedbackListenerManager.onFeedbackEnabledChanged(ConversationImpl.this.isFeedbackEnabled());
                        break;
                    case 31:
                        ConversationImpl.this.asrOnlineManager.onAsrAvailableChanged(py0Var.z0.contains(oy0.Y));
                        break;
                    case 32:
                        ConversationImpl.this.waitingRoomParticipants.onWaitingRoomEnabled(ConversationImpl.this.isWaitingRoomEnabled());
                        this.listener.onWaitingRoomEnabledChanged(ConversationImpl.this.isWaitingRoomEnabled());
                        break;
                    case 35:
                        if (obj instanceof vi9) {
                            vi9 vi9Var = (vi9) obj;
                            this.listener.onMuteStateInitialized(vi9Var);
                            ConversationImpl.this.mediaMuteListenerManager.onMuteStateInitialized(vi9Var);
                            break;
                        }
                        break;
                    case 36:
                        this.listener.onMigratedToServerTopology();
                        ConversationImpl.this.asrOnlineManager.onMigratedToServerCallTopology();
                        break;
                    case LangUtils.HASH_OFFSET /* 37 */:
                        if (obj instanceof String) {
                            this.listener.onJoinLinkUpdated((String) obj);
                            break;
                        }
                        break;
                    case 38:
                        if (obj instanceof kd9) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStarted((kd9) obj);
                            break;
                        }
                        break;
                    case 39:
                        if (obj instanceof md9) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStatesUpdatedChanged((md9) obj);
                            break;
                        }
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        if (obj instanceof nd9) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStopped((nd9) obj);
                            break;
                        }
                        break;
                }
            }
        }

        @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
        public void onMeInWaitingRoomChanged(boolean z) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onMeInWaitingRoomChanged(z);
            }
        }

        @Override // defpackage.bnd
        public void onRateCall(JSONObject jSONObject) {
            RateCallData rateCallData;
            ConversationParams conversationParams = ConversationImpl.this.conversationParams;
            if (conversationParams == null || (rateCallData = conversationParams.rateCallData) == null) {
                return;
            }
            this.listener.onRateCall(rateCallData);
        }

        @Override // defpackage.jg1
        public void onStateChanged(bg1 bg1Var, dg1 dg1Var) {
            if (this.listener != null) {
                ConversationParticipant byInternal = ConversationImpl.this.store.getByInternal(bg1Var);
                if (byInternal == null) {
                    byInternal = ConversationParticipant.fromInternal(bg1Var, ConversationImpl.this.idMappingWrapper);
                }
                this.listener.onStateChanged(byInternal, dg1Var);
                ConversationImpl.this.participantStatesManager.onStateChanged(bg1Var, dg1Var);
            }
        }

        @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
        public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
            }
        }

        public void release() {
            this.listener = null;
        }
    }

    public ConversationImpl(ConversationBuilder conversationBuilder) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainThreadHandler = handler;
        LocalIdMappings localIdMappings = new LocalIdMappings();
        this.localIdMappings = localIdMappings;
        this.peerIdGenerator = new PeerIdGenerator();
        this.callParticipantResolutionRunnable = new n(4, this);
        this.audioSampleEnergyCalculatorRegistered = false;
        AtomicReference<Conversation.State> atomicReference = new AtomicReference<>(Conversation.State.None);
        this.state = atomicReference;
        this.creator = conversationBuilder.creator;
        q2a q2aVar = conversationBuilder.api;
        this.api = q2aVar;
        this.executorService = conversationBuilder.executorService;
        this.version = conversationBuilder.version;
        boolean z = conversationBuilder.isCaller;
        this.isCaller = z;
        this.isAnswer = conversationBuilder.isAnswer;
        String str = conversationBuilder.cid;
        str = str == null ? "" : str;
        hw3 hw3Var = new hw3();
        hw3Var.a = str;
        this.cidProvider = hw3Var;
        this.hotStart = conversationBuilder.hotStart;
        this.forceRelayPolicy = conversationBuilder.forceRelayPolicy;
        this.disposable = new hc3();
        ExtLogger extLogger = conversationBuilder.stat;
        this.stat = extLogger;
        i7b i7bVar = new i7b(conversationBuilder.context);
        this.preferencesHelper = i7bVar;
        a4c a4cVar = conversationBuilder.log;
        this.log = a4cVar;
        b4c b4cVar = conversationBuilder.logConfiguration;
        this.logConfiguration = b4cVar;
        IdMappingWrapper idMappingWrapper = conversationBuilder.idMappingWrapper;
        this.idMappingWrapper = idMappingWrapper;
        this.initialJoinLink = conversationBuilder.joinLink;
        ConversationParticipant conversationParticipant = conversationBuilder.f143me;
        this.f144me = conversationParticipant;
        conversationParticipant.setReported(true);
        ParticipantStore participantStore = new ParticipantStore(conversationParticipant, localIdMappings);
        this.store = participantStore;
        this.audioLevelFrequencyMs = conversationBuilder.audioLevelFrequencyMs;
        ag1 ag1VarCreateCallParams = CallUtil.createCallParams(conversationBuilder);
        this.callParams = ag1VarCreateCallParams;
        StartCallApiParams startCallApiParamsCreateStartCallApiParams = createStartCallApiParams(conversationBuilder);
        this.startCallApiParams = startCallApiParamsCreateStartCallApiParams;
        bi biVar = conversationBuilder.animojiRenderProvider;
        this.animojiDataSupplier = biVar;
        ConversationParticipant conversationParticipant2 = null;
        fg1 fg1Var = new fg1(conversationParticipant.getInternalId(), null, null, null);
        conversationParticipant.setCallParticipant(fg1Var, localIdMappings);
        ConversationParticipant conversationParticipant3 = conversationBuilder.initialOpponent;
        if (conversationParticipant3 != null && !Objects.equals(conversationParticipant3.getExternalId(), conversationParticipant.getExternalId())) {
            conversationParticipant2 = conversationBuilder.initialOpponent;
        }
        this.initialOpponent = conversationParticipant2;
        if (conversationParticipant2 != null) {
            participantStore.addToActiveSessionRoom(conversationParticipant2);
            this.initialOpponent.setReported(true);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        ConversationEventsListener conversationEventsListener = conversationBuilder.eventListener;
        if (conversationEventsListener != null) {
            copyOnWriteArraySet.add(conversationEventsListener);
        }
        MultiEventListener multiEventListener = new MultiEventListener(copyOnWriteArraySet);
        this.eventListener = multiEventListener;
        ListenerImpl listenerImpl = new ListenerImpl(multiEventListener);
        this.listener = listenerImpl;
        wte wteVar = new wte();
        Context context = conversationBuilder.context;
        boolean z2 = conversationBuilder.isJoined;
        boolean z3 = this.initialOpponent != null;
        boolean zIsVideo = startCallApiParamsCreateStartCallApiParams.getIsVideo();
        gy9 gy9Var = conversationBuilder.cameraCapturerFactory;
        py0 py0Var = new py0(context, ag1VarCreateCallParams, z, z2, fg1Var, hw3Var, z3, zIsVideo, extLogger, a4cVar, b4cVar, gy9Var == null ? new gk3(a4cVar) : gy9Var, this.forceRelayPolicy, conversationBuilder.rotationProvider, biVar, wteVar, conversationBuilder.analyticsSender, i7bVar, conversationBuilder.screenCapturePermissionProvider);
        this.call = py0Var;
        this.screenCaptureManager = new ScreenCaptureManagerImpl(py0Var);
        this.cameraManager = new CameraManagerImpl(py0Var, new a(this, 4), new a(this, 5));
        VideoRenderManagerImpl videoRenderManagerImpl = new VideoRenderManagerImpl(new jw3(atomicReference, 0), py0Var, new ConversationRenderers(), participantStore);
        this.videoRendererProvider = videoRenderManagerImpl;
        this.videoRenderManager = videoRenderManagerImpl;
        this.microphoneManager = new MicrophoneManagerImpl(py0Var, new a(this, 6));
        this.noiseSuppressionManager = new NoiseSuppressionManagerImpl(py0Var);
        NetworkConnectionManagerImpl networkConnectionManagerImpl = new NetworkConnectionManagerImpl(py0Var);
        this.networkConnectionManager = networkConnectionManagerImpl;
        SignalingProvider signalingProviderCreateSignalingProvider = createSignalingProvider();
        this.debugManager = new DebugManagerImpl(py0Var, extLogger, hw3Var, a4cVar, signalingProviderCreateSignalingProvider);
        ParticipantStatesManagerImpl participantStatesManagerImplCreateParticipantStatesManager = createParticipantStatesManager(participantStore, new ParticipantStateChanger(signalingProviderCreateSignalingProvider), multiEventListener);
        this.participantStatesManager = participantStatesManagerImplCreateParticipantStatesManager;
        IdMappingResolver idMappingResolverCreateIdMappingResolver = createIdMappingResolver();
        this.waitingRoomParticipants = createWaitingRoomParticipants(idMappingWrapper, idMappingResolverCreateIdMappingResolver, listenerImpl);
        this.stereoRoomManager = createStereoRoomManager(signalingProviderCreateSignalingProvider, idMappingResolverCreateIdMappingResolver, wteVar);
        IdsMapper<ParticipantId, bg1> externalToInternalIdsMapper = conversationBuilder.internalIdsMapper;
        externalToInternalIdsMapper = externalToInternalIdsMapper == null ? new ExternalToInternalIdsMapper(q2aVar, ag1VarCreateCallParams, conversationBuilder.log) : externalToInternalIdsMapper;
        this.internalIdsMapper = externalToInternalIdsMapper;
        this.internalIdsResolver = createInternalIdsResolver(participantStore, idMappingWrapper, externalToInternalIdsMapper);
        this.externalIdsResolver = createExternalIdsResolver(participantStore, idMappingWrapper, conversationBuilder.externalIdsMapper);
        this.addParticipantsCommands = new AddParticipantsCommands(signalingProviderCreateSignalingProvider, py0Var, idMappingWrapper, new jw3(atomicReference, 0));
        WatchTogetherListenerManagerImpl watchTogetherListenerManagerImpl = new WatchTogetherListenerManagerImpl(participantStore);
        this.watchTogetherListenerManager = watchTogetherListenerManagerImpl;
        SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl = new SessionRoomListenerManagerImpl(participantStore);
        WatchTogetherPlayer watchTogetherPlayerCreateWatchTogetherPlayer = createWatchTogetherPlayer(watchTogetherListenerManagerImpl, signalingProviderCreateSignalingProvider);
        this.watchTogetherPlayer = watchTogetherPlayerCreateWatchTogetherPlayer;
        FeedbackListenerManagerImpl feedbackListenerManagerImpl = new FeedbackListenerManagerImpl(this, participantStore, idMappingResolverCreateIdMappingResolver, idMappingWrapper);
        this.feedbackListenerManager = feedbackListenerManagerImpl;
        this.feedbackManager = createFeedbackManager(feedbackListenerManagerImpl, signalingProviderCreateSignalingProvider);
        AsrListenerManagerImpl asrListenerManagerImpl = new AsrListenerManagerImpl(participantStore);
        this.asrListenerManager = asrListenerManagerImpl;
        this.asrManager = createAsrManager(asrListenerManagerImpl, participantStore, signalingProviderCreateSignalingProvider);
        this.contactCallManager = new ContactCallManagerImpl(participantStore, conversationBuilder.answerAsContact);
        this.asrOnlineManager = createAsrOnlineManager(participantStore);
        this.chatStateListener = conversationBuilder.chatStateListener;
        this.conversationFeatureListeners = createConversationFeatureListeners();
        this.conversationFeatureManager = createFeatureManager(signalingProviderCreateSignalingProvider);
        this.sessionRoomManager = createSessionRoomManager(sessionRoomListenerManagerImpl, participantStatesManagerImplCreateParticipantStatesManager, idMappingResolverCreateIdMappingResolver, signalingProviderCreateSignalingProvider);
        this.participantsUpdater = createParticipantsUpdater(participantStatesManagerImplCreateParticipantStatesManager);
        this.recordManager = createRecordManager(idMappingResolverCreateIdMappingResolver, idMappingWrapper, signalingProviderCreateSignalingProvider);
        this.locale = conversationBuilder.locale;
        this.sessionRoomWatchTogetherHandler = new SessionRoomWatchTogetherHandler(participantStore, watchTogetherPlayerCreateWatchTogetherPlayer);
        this.sessionRoomParticipantStatesHandler = createParticipantStatesHandler(participantStatesManagerImplCreateParticipantStatesManager);
        this.conversationStats = createConversationStats(wteVar);
        this.urlSharingListenerManager = createUrlSharingListenerManager();
        this.urlSharingManager = createUrlSharingManager();
        ChatListenerManagerImpl chatListenerManagerImplCreateChatListenerManager = createChatListenerManager(participantStore);
        this.chatListenerManager = chatListenerManagerImplCreateChatListenerManager;
        this.chatManager = createChatManager(participantStore, chatListenerManagerImplCreateChatListenerManager);
        MediaMuteListenerManagerImpl mediaMuteListenerManagerImplCreateMediaMuteListenerManager = createMediaMuteListenerManager();
        this.mediaMuteListenerManager = mediaMuteListenerManagerImplCreateMediaMuteListenerManager;
        this.mediaMuteManager = createMediaMuteManager(signalingProviderCreateSignalingProvider, mediaMuteListenerManagerImplCreateMediaMuteListenerManager);
        this.apiService = conversationBuilder.okApiService;
        this.displayLayoutSender = new DisplayLayoutSenderImpl(new jy2(7, participantStore), new q(this, 1));
        this.audioSampleEnergyCalculator = new AnonymousClass1(handler);
        MediaConnectionManagerImpl mediaConnectionManagerImpl = new MediaConnectionManagerImpl(conversationBuilder.log, new a(this, 7), conversationBuilder.mediaConnectionSettings);
        this.mediaConnectionManager = mediaConnectionManagerImpl;
        networkConnectionManagerImpl.plusAssign(mediaConnectionManagerImpl);
        this.rateManager = new RateManagerImpl(a4cVar, conversationBuilder.rttRateHintConfig);
    }

    private void assertInited() {
        if (!this.inited) {
            throw new IllegalStateException("Conversation not initialized");
        }
        if (isDestroyed()) {
            throw new IllegalStateException("Conversation already destroyed");
        }
    }

    private void assertPrepared() {
        if (!this.prepared) {
            throw new IllegalStateException("Conversation not ready");
        }
        if (isDestroyed()) {
            throw new IllegalStateException("Conversation already destroyed");
        }
    }

    private String configureSignalingCapabilities() {
        SignalingCapabilities signalingCapabilities = new SignalingCapabilities();
        signalingCapabilities.setScreenTrackProducerEnabled(true);
        signalingCapabilities.setScreenTrackConsumerEnabled(true);
        signalingCapabilities.setVideoTracksEnabled(this.callParams.g > 0);
        signalingCapabilities.setWaitingHallEnabled(this.callParams.n);
        signalingCapabilities.setFilterDefaultValues(this.callParams.o);
        signalingCapabilities.setMuteNotificationForAdmin(true);
        signalingCapabilities.setWatchTogetherEnabled(true);
        signalingCapabilities.setSessionRoomsEnabled(this.callParams.t);
        this.animojiDataSupplier.getClass();
        signalingCapabilities.setAnimojiEnabled(false);
        signalingCapabilities.setContactCallsEnabled(true);
        signalingCapabilities.setAudienceModeEnabled(this.callParams.y);
        return signalingCapabilities.getSignalingCapabilitiesValue();
    }

    private AsrManager createAsrManager(AsrListenerManager asrListenerManager, ParticipantStore participantStore, SignalingProvider signalingProvider) {
        return new AsrManagerImpl(new AsrCommandsExecutorImpl(signalingProvider, participantStore), asrListenerManager);
    }

    private AsrOnlineManagerImpl createAsrOnlineManager(ParticipantStore participantStore) {
        return new AsrOnlineManagerImpl(new AsrOnlineCommandsExecutorImpl(new a(this, 2), createSignalingProvider()), new AsrOnlineListenerManagerImpl(participantStore), new a(this, 3));
    }

    private ChatListenerManagerImpl createChatListenerManager(ParticipantStore participantStore) {
        return new ChatListenerManagerImpl(participantStore);
    }

    private ChatManagerImpl createChatManager(ParticipantStore participantStore, ChatListenerManagerImpl chatListenerManagerImpl) {
        return new ChatManagerImpl(new ChatCommandExecutorImpl(createSignalingProvider(), participantStore), chatListenerManagerImpl);
    }

    private ConversationFeatureListenersImpl createConversationFeatureListeners() {
        return new ConversationFeatureListenersImpl();
    }

    private Prepare createConversationPrepare(ConversationParams conversationParams) {
        return new Prepare(this.apiService, this.cidProvider, conversationParams, this.internalIdsResolver, this.externalIdsResolver, this.startCallApiParams, this.peerIdGenerator, this.conversationStats.preparedStat, this.isAnswer, this.isCaller, this.log, this.callParams);
    }

    private ConversationStats createConversationStats(vte vteVar) {
        py0 py0Var = this.call;
        Objects.requireNonNull(py0Var);
        return new ConversationStats(new vx0(py0Var, 5), this.stat, this.cidProvider, getCallType(), vteVar);
    }

    private ExternalIdsResolver createExternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper, IdsMapper<bg1, ParticipantId> idsMapper) {
        MultiEventListener multiEventListener = this.eventListener;
        Objects.requireNonNull(multiEventListener);
        v02 v02Var = new v02(29, multiEventListener);
        yv3 yv3Var = new yv3(5);
        LocalIdMappings localIdMappings = this.localIdMappings;
        if (idsMapper == null) {
            idsMapper = new InternalToExternalIdsMapper(this.api, this.callParams, this.log);
        }
        return new ExternalIdsResolver(participantStore, idMappingWrapper, v02Var, yv3Var, localIdMappings, idsMapper);
    }

    private ConversationFeatureManagerImpl createFeatureManager(SignalingProvider signalingProvider) {
        return new ConversationFeatureManagerImpl(new ConversationFeatureCommandExecutorImpl(signalingProvider), this.conversationFeatureListeners);
    }

    private FeedbackManager createFeedbackManager(FeedbackListenerManager feedbackListenerManager, SignalingProvider signalingProvider) {
        return new FeedbackManagerImpl(new FeedbackCommandsExecutorImpl(signalingProvider), feedbackListenerManager);
    }

    private IdMappingResolver createIdMappingResolver() {
        return new IdMappingResolver() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.4
            @Override // ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver
            public void resolveExternalsByInternalsIds(List<bg1> list, Runnable runnable, Runnable runnable2) {
                ConversationImpl.this.resolveExternalsByInternalsIds(list, runnable, runnable2);
            }

            @Override // ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver
            public void withInternalId(ParticipantId participantId, rj3 rj3Var, Runnable runnable) {
                ConversationImpl.this.withInternalId(participantId, rj3Var, runnable);
            }
        };
    }

    private InternalIdsResolver createInternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper, IdsMapper<ParticipantId, bg1> idsMapper) {
        return new InternalIdsResolver(participantStore, idMappingWrapper, new yv3(4), this.localIdMappings, idsMapper);
    }

    private MediaMuteListenerManagerImpl createMediaMuteListenerManager() {
        return new MediaMuteListenerManagerImpl();
    }

    private MediaMuteManagerImpl createMediaMuteManager(SignalingProvider signalingProvider, MediaMuteListenerManager mediaMuteListenerManager) {
        a aVar = new a(this, 1);
        q qVar = new q(this, 0);
        ParticipantStore participantStore = this.store;
        Objects.requireNonNull(participantStore);
        return new MediaMuteManagerImpl(new MediaMuteCommandExecutorImpl(signalingProvider, aVar, qVar, new es3(3, participantStore)), mediaMuteListenerManager);
    }

    private SessionRoomParticipantStatesHandler createParticipantStatesHandler(ParticipantStatesManagerImpl participantStatesManagerImpl) {
        return new SessionRoomParticipantStatesHandler(participantStatesManagerImpl, new a(this, 0));
    }

    private ParticipantStatesManagerImpl createParticipantStatesManager(ParticipantStore participantStore, ParticipantStateChanger participantStateChanger, ConversationEventsListener conversationEventsListener) {
        return new ParticipantStatesManagerImpl(participantStore, participantStateChanger, conversationEventsListener, this.mainThreadHandler);
    }

    private ParticipantsUpdater createParticipantsUpdater(ParticipantStatesManagerImpl participantStatesManagerImpl) {
        MultiEventListener multiEventListener = this.eventListener;
        ParticipantStore participantStore = this.store;
        IdMappingWrapper idMappingWrapper = this.idMappingWrapper;
        LocalIdMappings localIdMappings = this.localIdMappings;
        ParticipantsUpdater.MappingUpdater mappingUpdater = new ParticipantsUpdater.MappingUpdater() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.2
            @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MappingUpdater
            public void reportIfApplicable() {
                ConversationImpl.this.reportIfApplicable();
            }

            @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MappingUpdater
            public void triggerMapUpdate() {
                ConversationImpl.this.mainThreadHandler.removeCallbacks(ConversationImpl.this.callParticipantResolutionRunnable);
                ConversationImpl.this.mainThreadHandler.post(ConversationImpl.this.callParticipantResolutionRunnable);
            }
        };
        ConversationParticipant conversationParticipant = this.f144me;
        Objects.requireNonNull(conversationParticipant);
        return new ParticipantsUpdater(multiEventListener, participantStore, participantStatesManagerImpl, idMappingWrapper, localIdMappings, mappingUpdater, new v02(28, conversationParticipant), this.callParams);
    }

    private RecordManagerImpl createRecordManager(IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper, SignalingProvider signalingProvider) {
        return new RecordManagerImpl(this.log, this.store, idMappingResolver, idMappingWrapper, signalingProvider, this.eventListener);
    }

    private SessionRoomsManagerImpl createSessionRoomManager(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, ParticipantStatesManagerImpl participantStatesManagerImpl, IdMappingResolver idMappingResolver, SignalingProvider signalingProvider) {
        SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl = new SessionRoomCommandExecutorImpl(participantStatesManagerImpl, signalingProvider);
        SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl = new SessionRoomParticipantsDataProviderImpl(this.store, sessionRoomListenerManagerImpl, idMappingResolver, this.idMappingWrapper);
        return new SessionRoomsManagerImpl(sessionRoomListenerManagerImpl, sessionRoomCommandExecutorImpl, new SessionRoomAdminCommandExecutorImpl(signalingProvider, sessionRoomParticipantsDataProviderImpl), sessionRoomParticipantsDataProviderImpl);
    }

    private SignalingProvider createSignalingProvider() {
        py0 py0Var = this.call;
        Objects.requireNonNull(py0Var);
        return new zx0(py0Var);
    }

    private StartCallApiParams createStartCallApiParams(ConversationBuilder conversationBuilder) {
        return new StartCallApiParams(conversationBuilder.domainId, conversationBuilder.payload, conversationBuilder.isWatchTogetherEnabledForAll, conversationBuilder.hasVideo, conversationBuilder.clientType, conversationBuilder.multipleDevicesEnabled, conversationBuilder.chatId);
    }

    private StereoRoomManagerImpl createStereoRoomManager(SignalingProvider signalingProvider, IdMappingResolver idMappingResolver, vte vteVar) {
        return new StereoRoomManagerImpl(this.log, this.store, idMappingResolver, new p(this), new StereoRoomCommandExecutorImpl(signalingProvider, this.log), this.idMappingWrapper, new StereoRoomListenerManagerImpl(), vteVar);
    }

    private UrlSharingListenerManagerImpl createUrlSharingListenerManager() {
        return new UrlSharingListenerManagerImpl(createIdMappingResolver(), this.idMappingWrapper, this.log);
    }

    private UrlSharingManagerImpl createUrlSharingManager() {
        return new UrlSharingManagerImpl(new UrlSharingCommandsExecutorImpl(createSignalingProvider()), this.urlSharingListenerManager);
    }

    private WaitingRoomParticipants createWaitingRoomParticipants(IdMappingWrapper idMappingWrapper, IdMappingResolver idMappingResolver, final ListenerImpl listenerImpl) {
        return new WaitingRoomParticipants(new WaitingRoomParticipants.Listener() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.3
            @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
            public void onMeInWaitingRoomChanged(boolean z) {
                listenerImpl.onMeInWaitingRoomChanged(z);
            }

            @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
            public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
                listenerImpl.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
            }
        }, idMappingWrapper, idMappingResolver, this.log);
    }

    private WatchTogetherPlayer createWatchTogetherPlayer(WatchTogetherListenerManager watchTogetherListenerManager, SignalingProvider signalingProvider) {
        py0 py0Var = this.call;
        Objects.requireNonNull(py0Var);
        return new WatchTogetherPlayerImpl(new WatchTogetherCommandExecutorImpl(signalingProvider, new vx0(py0Var, 6)), watchTogetherListenerManager);
    }

    private void doStartCall() {
        synchronized (this.stateTransitionLock) {
            try {
                if (isDestroyed()) {
                    this.log.log(LOG_TAG, "attempted to continue init after release, ignoring");
                    return;
                }
                assertPrepared();
                ConversationParticipant conversationParticipant = this.initialOpponent;
                if (conversationParticipant != null) {
                    py0 py0Var = this.call;
                    conversationParticipant.setCallParticipant(py0Var.p1.j(conversationParticipant.getInternalId()), this.localIdMappings);
                }
                py0 py0Var2 = this.call;
                pg4 pg4Var = this.videoRendererProvider;
                if (py0Var2.i()) {
                    py0Var2.v1 = pg4Var;
                    if (pg4Var == null) {
                        py0Var2.t1.s();
                    }
                }
                if (!this.isCaller) {
                    this.call.B(this.startCallApiParams.getIsVideo());
                }
                this.inited = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private <T> void executeOnBg(k56 k56Var, rj3 rj3Var, Runnable runnable) {
        this.disposable.a(CallsThreadUtilsKt.executeOnIoThread(k56Var, rj3Var, runnable));
    }

    private <P extends ActionParams, R extends ActionResult> iqd executeWithState(Conversation.State state, Conversation.State state2, Action<P, R> action, P p) {
        AtomicReference<Conversation.State> atomicReference = this.state;
        while (!atomicReference.compareAndSet(state, state2)) {
            if (atomicReference.get() != state) {
                return iqd.f(new IllegalStateException("State " + this.state.get() + " doesn't match wanted state " + state));
            }
        }
        return action.execute(p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConversationEventsListener.CallEndInfo getCallEndInfo(ji6 ji6Var, Object obj) {
        HashSet hashSet;
        String str;
        if (obj instanceof hi6) {
            hi6 hi6Var = (hi6) obj;
            hashSet = new HashSet();
            if (hi6Var.a.contains(gi6.a)) {
                hashSet.add(HangupHint.SHOULD_RECONNECT);
            }
            str = hi6Var.b;
        } else {
            hashSet = null;
            str = null;
        }
        return new ConversationEventsListener.CallEndInfo(ji6Var, hashSet, str);
    }

    private fg1 getCallParticipantByExternalId(ParticipantId participantId) {
        ConversationParticipant byExternalWithAnyDevice = this.store.getByExternalWithAnyDevice(participantId);
        if (byExternalWithAnyDevice != null) {
            return byExternalWithAnyDevice.getCallParticipant();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bg1 getCallParticipantId(ParticipantId participantId) {
        ConversationParticipant byExternal;
        fg1 callParticipant;
        if (participantId == null || (byExternal = this.store.getByExternal(participantId)) == null || (callParticipant = byExternal.getCallParticipant()) == null) {
            return null;
        }
        return callParticipant.a;
    }

    @Deprecated
    private ConversationParticipant getParticipantByExternalId(String str) {
        return this.store.getByExternalWithAnyDevice(ParticipantId.authorized(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addParticipant$25(rj3 rj3Var, JSONObject jSONObject) throws JSONException {
        if (rj3Var != null) {
            rj3Var.accept(jSONObject.optString("error", ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$26(Boolean bool, boolean z, rj3 rj3Var, Collection collection) {
        this.call.j((bg1) collection.iterator().next(), bool, Boolean.valueOf(z), new k(rj3Var, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addParticipant$27(rj3 rj3Var, JSONObject jSONObject) throws JSONException {
        if (rj3Var != null) {
            rj3Var.accept(jSONObject.optString("error", ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$28(boolean z, rj3 rj3Var, InternalIdResponse internalIdResponse) throws Throwable {
        this.call.j(new bg1(1, 0, internalIdResponse.okId), Boolean.valueOf(z), Boolean.FALSE, new k(rj3Var, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$29(Throwable th) throws Throwable {
        this.log.reportException(LOG_TAG, "failed to add participant", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipants$30(Boolean bool, boolean z, m56 m56Var, m56 m56Var2, Collection collection) {
        this.addParticipantsCommands.addParticipants(collection, bool, z, m56Var, m56Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ py0 lambda$createAsrOnlineManager$5() {
        return this.call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ py0 lambda$createAsrOnlineManager$6() {
        return this.call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ py0 lambda$createMediaMuteManager$4() {
        return this.call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$0() {
        return Boolean.valueOf(this.inited);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$1() {
        return Boolean.valueOf(this.prepared);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$2() {
        return Boolean.valueOf(this.prepared);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e5f lambda$new$3(List list) {
        py0 py0Var = this.call;
        py0Var.getClass();
        py0Var.V0.log("OKRTCCall", "updateDisplayLayout " + list);
        if (py0Var.i()) {
            py0Var.t1.T(list);
            py0Var.E1.getClass();
            die dieVar = py0Var.b2;
            ((wte) ((vte) dieVar.b)).getClass();
            muc.a().b(new tb2(dieVar, list, SystemClock.elapsedRealtime(), 4));
        }
        return e5f.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performConfroomJoin$11(ConversationParams conversationParams, rj3 rj3Var, rj3 rj3Var2, JoinByIdResponse joinByIdResponse) throws Throwable {
        this.forceRelayPolicy |= joinByIdResponse.getP2pForbidden();
        performConnect(joinByIdResponse.getEndpoint(), conversationParams, rj3Var, rj3Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performConnect$19(String str) {
        this.recordManager.onRecordError(new nh1(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performConnect$20() {
        if (this.listener.listener != null) {
            hangup(new ii6(ji6.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performConnect$21() {
        this.mainThreadHandler.post(new n(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performConnect$22(rj3 rj3Var, py0 py0Var) {
        this.conversationStats.connectedToSignalingStat.onConnectedToSignaling();
        this.isConcurrent = py0Var.R0;
        this.state.getAndSet(Conversation.State.Connected);
        ExtLogger extLogger = this.stat;
        d4a d4aVarSimpleBuilderAny = ExtLogger.simpleBuilderAny("callForceRelay");
        d4aVarSimpleBuilderAny.c("vcid", ((hw3) this.cidProvider).a);
        d4aVarSimpleBuilderAny.c("param", this.forceRelayPolicy ? "1" : "0");
        extLogger.log(d4aVarSimpleBuilderAny.a());
        if (rj3Var != null) {
            rj3Var.accept(this);
        }
        jb9.e();
        py0Var.b1 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$7(boolean z, rj3 rj3Var, boolean z2, rj3 rj3Var2, Prepare.PrepareResult prepareResult) throws Throwable {
        ArrayList arrayList = new ArrayList(prepareResult.getUnresolvedParticipantIds());
        if (!arrayList.isEmpty()) {
            this.eventListener.onCallStartResolutionFailed(arrayList);
        }
        if (!z) {
            boolean z3 = !arrayList.isEmpty();
            Iterator<ConversationParticipant> it = this.store.iterator();
            int i = 0;
            while (it.hasNext()) {
                ConversationParticipant next = it.next();
                boolean zEquals = Objects.equals(next.getExternalId(), this.f144me.getExternalId());
                boolean z4 = next.getInternalId() != null;
                z3 &= !z4 || zEquals;
                i += (!z4 || zEquals) ? 0 : 1;
            }
            if (z3) {
                rj3Var.accept(new CallFailedException("no call targets left"));
                return;
            }
            if (i == 1) {
                Iterator<ConversationParticipant> it2 = this.store.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ConversationParticipant next2 = it2.next();
                    if (next2.getInternalId() != null && !Objects.equals(next2.getExternalId(), this.f144me.getExternalId())) {
                        this.initialOpponent = next2;
                        break;
                    }
                }
            }
        }
        ConversationParams conversationParams = prepareResult.getConversationParams();
        if (conversationParams == null && !this.isCaller) {
            rj3Var.accept(new NullPointerException("Conversation parameters object MUST not be null for a not calling participant"));
            return;
        }
        if (this.isCaller) {
            runStartConversation(conversationParams, z, z2, rj3Var2, rj3Var);
        } else if (this.expectedChat) {
            performConfroomJoin(conversationParams, rj3Var2, rj3Var);
        } else {
            performConnect(conversationParams.endpoint, conversationParams, rj3Var2, rj3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareJoinByLink$9(rj3 rj3Var, rj3 rj3Var2, Prepare.PrepareResult prepareResult) throws Throwable {
        ConversationParams conversationParams = prepareResult.getConversationParams();
        if (conversationParams == null) {
            rj3Var.accept(new NullPointerException("Conversation parameters object MUST not be null"));
            return;
        }
        this.forceRelayPolicy |= conversationParams.isP2PForbidden;
        performConnect(conversationParams.endpoint, conversationParams, rj3Var2, rj3Var);
        this.call.F0 = this.initialJoinLink;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$promoteParticipant$32(boolean z, bg1 bg1Var) {
        py0 py0Var = this.call;
        py0Var.Z.d(f46.r(bg1Var, z), false, new ey0(py0Var, bg1Var, 1), py0Var.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryChatHistory$38(Conversation.ChatHistoryCallback chatHistoryCallback, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("messages");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        int length = jSONArrayOptJSONArray.length();
        ChatHistoryEntry[] chatHistoryEntryArr = new ChatHistoryEntry[length];
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                bg1 bg1VarE = f46.E(jSONObjectOptJSONObject);
                ConversationParticipant byInternal = this.store.getByInternal(bg1VarE);
                if (byInternal == null) {
                    byInternal = ConversationParticipant.fromInternal(bg1VarE, this.idMappingWrapper);
                }
                chatHistoryEntryArr[i] = new ChatHistoryEntry(jSONObjectOptJSONObject.optString("message", ""), jSONObjectOptJSONObject.optBoolean("direct", false), byInternal);
            }
        }
        chatHistoryCallback.onResponse(chatHistoryEntryArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshParams$13(Runnable runnable, ConversationParams conversationParams) throws Throwable {
        this.conversationParams = conversationParams;
        this.prepared = true;
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$removeJoinLink$37(Runnable runnable, rj3 rj3Var, Boolean bool) throws Throwable {
        if (bool.booleanValue()) {
            runnable.run();
        } else {
            rj3Var.accept(new AssertionError("unreachable"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$removeParticipant$31(boolean z, bg1 bg1Var) {
        py0 py0Var = this.call;
        py0Var.getClass();
        py0Var.V0.log("OKRTCCall", "removeParticipant, participant=" + bg1Var);
        if (py0Var.i()) {
            fg1 fg1VarJ = py0Var.p1.j(bg1Var);
            die dieVar = py0Var.S1.g;
            Long lG = ((ece) dieVar.o).g();
            if (lG != null) {
                long jLongValue = lG.longValue();
                HashMap map = new HashMap();
                qz7 qz7Var = (qz7) dieVar.a;
                map.put("vcid", ((d4c) qz7Var.b).conversationId);
                map.put("stat_time_delta", String.valueOf(jLongValue));
                map.put("network_type", jb9.b((ConnectivityManager) dieVar.b, (TelephonyManager) dieVar.c));
                die.k(bg1Var, fg1VarJ, map);
                ((d4c) qz7Var.b).log(d4c.COLLECTOR_WEBRTC, "callRemoveParticipant", map);
            }
            try {
                if (bg1Var.equals(py0Var.I1)) {
                    py0Var.I1 = null;
                    py0Var.k(w51.I0, null);
                }
                rod rodVar = py0Var.Z;
                JSONObject jSONObject = new JSONObject();
                f46.d(bg1Var, jSONObject, false);
                jSONObject.put("ban", z);
                rodVar.h(f46.b(jSONObject, "remove-participant"), new ey0(py0Var, bg1Var, 0));
            } catch (JSONException e) {
                throw new RuntimeException("Remove participant command failed", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveExternalsByInternalsIds$39(Runnable runnable, Throwable th) throws Throwable {
        if (runnable != null) {
            runnable.run();
        }
        this.log.reportException(LOG_TAG, "failed to get mapping", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$runStartConversation$15(PeerConnection.IceServer iceServer) {
        String str;
        return (iceServer == null || (str = iceServer.hostname) == null || !str.startsWith("turn")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$runStartConversation$17(rj3 rj3Var, ConversationParams conversationParams, rj3 rj3Var2, CallInfo callInfo) throws Throwable {
        String str;
        this.callInfo = callInfo;
        boolean z = true;
        this.wantsApiHangup = true;
        if (!callInfo.isConcurrent && ((str = callInfo.id) == null || str.equals(((hw3) this.cidProvider).a))) {
            z = false;
        }
        this.isConcurrentByApi = z;
        this.forceRelayPolicy |= callInfo.isP2PForbidden;
        String str2 = callInfo.id;
        if (str2 != null) {
            gw3 gw3Var = this.cidProvider;
            if (gw3Var instanceof hw3) {
                ((hw3) gw3Var).a = str2;
            }
        }
        String str3 = callInfo.endpoint;
        if (str3 == null) {
            rj3Var.accept(new IllegalStateException("couldn't create call endpoint is null"));
            return;
        }
        if (conversationParams == null) {
            conversationParams = callInfo.toParams();
        }
        performConnect(str3, conversationParams, rj3Var2, rj3Var);
        this.call.F0 = callInfo.joinLink;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$runStartConversation$18(rj3 rj3Var, Throwable th) throws Throwable {
        StringBuilder sb = new StringBuilder("ok.api.error.");
        sb.append(th.getClass().getSimpleName());
        if (th instanceof ApiInvocationException) {
            ApiInvocationException apiInvocationException = (ApiInvocationException) th;
            if (apiInvocationException.a == 1104) {
                ExternErrorParser.ErrorDescription errorDescription = new ExternErrorParser(this.log).parse(apiInvocationException);
                if (errorDescription.getErrorCode() != 0) {
                    sb.append('.');
                    sb.append(errorDescription.getErrorCode());
                }
                rj3Var.accept(new ExternApiException("external service failed", apiInvocationException, errorDescription.getErrorCode(), errorDescription.getExtendedError()));
            } else {
                rj3Var.accept(th);
            }
        } else {
            rj3Var.accept(th);
        }
        this.stat.logSimple(e0e.callError, ((hw3) this.cidProvider).a, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setCallOptionEnabled$23(boolean z, oy0 oy0Var, rj3 rj3Var, JSONObject jSONObject) throws JSONException {
        if (z) {
            py0 py0Var = this.call;
            py0Var.z0.add(oy0Var);
            py0Var.a(oy0Var);
        } else {
            py0 py0Var2 = this.call;
            py0Var2.z0.remove(oy0Var);
            py0Var2.a(oy0Var);
        }
        if (rj3Var != null) {
            rj3Var.accept(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setCallOptionEnabled$24(rj3 rj3Var, JSONObject jSONObject) throws JSONException {
        if (rj3Var != null) {
            rj3Var.accept(jSONObject.optString("error"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setMuteState$40(rod rodVar, boolean z, bg1 bg1Var) {
        try {
            rodVar.i(f46.b(new JSONObject().put("eId", bg1Var.c()).put("muteTarget", z), "switch-micro"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$withInternalId$33(ParticipantId participantId) {
        return this.internalIdsMapper.map(Collections.singleton(participantId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$withInternalId$34(ParticipantId participantId, rj3 rj3Var, Map map) {
        bg1 bg1Var = (bg1) map.get(participantId);
        if (bg1Var != null) {
            rj3Var.accept(bg1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$withInternalIds$35(ArrayList arrayList) {
        return this.internalIdsMapper.map(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$withInternalIds$36(rj3 rj3Var, ArrayList arrayList, Map map) {
        if (rj3Var != null) {
            arrayList.addAll(map.values());
            rj3Var.accept(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSignalingRefresh() {
        hrf hrfVar;
        ConversationParams conversationParams;
        if (this.call.A0 || (hrfVar = this.signalingTransport) == null || (conversationParams = this.conversationParams) == null) {
            return;
        }
        String str = conversationParams.token;
        hrfVar.n.onRestart();
        hrfVar.g.execute(new erf(hrfVar, str, 1));
    }

    private void performConfroomJoin(ConversationParams conversationParams, rj3 rj3Var, rj3 rj3Var2) {
        hc3 hc3Var = this.disposable;
        iqd iqdVarRetryApiCallForJoining = RetryKt.retryApiCallForJoining(this.apiService.joinToConversation(((hw3) this.cidProvider).a, this.peerIdGenerator.generatePeerId(), this.startCallApiParams), this.callParams.B.h, this.log);
        t tVar = new t(this, conversationParams, rj3Var, rj3Var2);
        i iVar = new i(rj3Var2, 3);
        iqdVarRetryApiCallForJoining.getClass();
        iq1 iq1Var = new iq1(tVar, 2, iVar);
        iqdVarRetryApiCallForJoining.k(iq1Var);
        hc3Var.a(iq1Var);
    }

    private void performConnect(String str, ConversationParams conversationParams, rj3 rj3Var, rj3 rj3Var2) {
        Locale locale;
        String str2;
        int i;
        synchronized (this.stateTransitionLock) {
            try {
                if (isDestroyed()) {
                    return;
                }
                if (conversationParams == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("No conversation parameters in performConnect()");
                    this.log.reportException(LOG_TAG, "An attempt to connect without conversation parameters", illegalStateException);
                    rj3Var2.accept(illegalStateException);
                    return;
                }
                if (this.startCallApiParams.getIsMultipleDevicesEnabled()) {
                    this.f144me.setDeviceIndex(conversationParams.deviceIndex, this.localIdMappings);
                    this.store.updateMe(this.f144me);
                }
                this.conversationParams = conversationParams;
                AtomicReference<Conversation.State> atomicReference = this.state;
                Conversation.State state = Conversation.State.Preparing;
                Conversation.State state2 = Conversation.State.Starting;
                while (!atomicReference.compareAndSet(state, state2)) {
                    if (atomicReference.get() != state) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Wrong state within performConnect(): " + this.state.get() + " expected state is " + Conversation.State.Preparing);
                        this.log.reportException(LOG_TAG, "An attempt to connect while conversation not in preparing state", illegalStateException2);
                        rj3Var2.accept(illegalStateException2);
                        return;
                    }
                }
                this.conversationStats.startedStat.onConversationStarted();
                fg1 callParticipant = this.f144me.getCallParticipant();
                callParticipant.a = this.f144me.getInternalId();
                if (this.isCaller || this.expectedChat) {
                    callParticipant.e(fg1.r);
                }
                ConversationParticipant conversationParticipant = this.initialOpponent;
                if (conversationParticipant != null && conversationParticipant.getInternalId() != null) {
                    this.call.H(this.initialOpponent.getInternalId());
                }
                if (this.isConcurrentByApi) {
                    this.call.R0 = true;
                }
                this.call.M0.add(this.listener);
                this.call.w1 = this.listener;
                subscribeCallListeners();
                setupSessionRoomWatchTogetherHandler(this.call);
                setupSessionRoomHandHandler(this.call);
                this.call.d1 = new rj3() { // from class: ru.ok.android.externcalls.sdk.r
                    @Override // defpackage.rj3
                    public final void accept(Object obj) {
                        this.a.lambda$performConnect$19((String) obj);
                    }
                };
                String strValueOf = this.f144me.getInternalId() != null ? String.valueOf(this.f144me.getInternalId().a) : null;
                String str3 = ((hw3) this.cidProvider).a;
                String str4 = conversationParams.token;
                int i2 = conversationParams.deviceIndex;
                String str5 = this.version;
                String clientType = this.startCallApiParams.getClientType();
                String strConfigureSignalingCapabilities = configureSignalingCapabilities();
                Integer num = conversationParams.ispAsNo;
                String str6 = conversationParams.ispAsOrg;
                String str7 = conversationParams.locCc;
                String str8 = conversationParams.locReg;
                Locale locale2 = this.locale;
                if (this.startCallApiParams.getIsMultipleDevicesEnabled()) {
                    locale = locale2;
                    str2 = str8;
                    this.log.log(LOG_TAG, "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6");
                    i = 6;
                } else {
                    locale = locale2;
                    str2 = str8;
                    i = 5;
                }
                Objects.requireNonNull(str3, "conversation id must not be null");
                Objects.requireNonNull(str4, "token must not be null");
                Objects.requireNonNull(str, "endpointBaseUrl must not be null");
                Objects.requireNonNull(str5, "appVersion must not be null");
                Objects.requireNonNull(clientType, "clientType must not be null");
                Objects.requireNonNull(strConfigureSignalingCapabilities, "capabilities must not be null");
                a25 a25Var = new a25(str3, str4, strValueOf, i2, str, str5, clientType, i, strConfigureSignalingCapabilities, num, str6, str7, str2, locale);
                u2a u2aVar = new u2a();
                this.callParams.b.getClass();
                n nVar = new n(2, this);
                SignalingStat signalingStat = this.conversationStats.wsSignalingStat;
                ExecutorService executorService = this.executorService;
                a4c a4cVar = this.log;
                b4c b4cVar = this.logConfiguration;
                this.callParams.b.getClass();
                boolean z = this.callParams.l;
                Objects.requireNonNull(signalingStat, "Signaling statistics is required");
                Objects.requireNonNull(executorService, "executor is required");
                Objects.requireNonNull(a4cVar, "log is required");
                Objects.requireNonNull(b4cVar, "log configuration is required");
                hrf hrfVar = new hrf(30000, nVar, signalingStat, executorService, a4cVar, b4cVar, u2aVar, z, a25Var);
                this.signalingTransport = hrfVar;
                b bVar = new b(this, rj3Var, 1);
                this.call.r(hrfVar, conversationParams.stunTurnServers, this.hotStart);
                this.waitingRoomParticipants.setCall(this.call);
                this.wantsApiHangup = true;
                this.prepared = true;
                this.state.set(Conversation.State.Connecting);
                py0 py0Var = this.call;
                py0Var.getClass();
                jb9.e();
                if (py0Var.w0) {
                    bVar.a(py0Var);
                } else {
                    py0Var.b1 = bVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private zl4 refreshParams(Runnable runnable, rj3 rj3Var) {
        iqd iqdVarRetryApiCallForBackgroundWork = RetryKt.retryApiCallForBackgroundWork(this.apiService.getConversationParams(this.anonToken, null), this.callParams.B.h, this.log);
        o oVar = new o(this, runnable, 0);
        i iVar = new i(rj3Var, 2);
        iqdVarRetryApiCallForBackgroundWork.getClass();
        iq1 iq1Var = new iq1(oVar, 2, iVar);
        iqdVarRetryApiCallForBackgroundWork.k(iq1Var);
        return iq1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportIfApplicable() {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = this.store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (!next.isReported() && next.getExternalId() != null && this.listener.listener != null) {
                next.setReported(true);
                arrayList.add(next);
                this.store.addToActiveSessionRoom(next);
            }
        }
        if (this.listener.listener == null || arrayList.isEmpty()) {
            return;
        }
        this.listener.listener.onParticipantsAdded(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetSignaling() {
        this.disposable.a(refreshParams(new n(3, this), new nj3(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolveExternalsByInternalsIds(List<bg1> list, Runnable runnable, Runnable runnable2) {
        if (list.isEmpty()) {
            runnable.run();
            return;
        }
        za3 za3VarH = this.externalIdsResolver.resolveIds(list).h(ce.a());
        Objects.requireNonNull(runnable);
        iq1 iq1Var = new iq1(new o(this, runnable2, 1), 0, new e5(6, runnable));
        za3VarH.i(iq1Var);
        this.disposable.a(iq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolveUnknownExternals() {
        resolveExternalsByInternalsIds(this.externalIdsResolver.collectExternalIdResolutionCandidates(), new n(1, this), null);
    }

    private void runStartConversation(ConversationParams conversationParams, boolean z, boolean z2, rj3 rj3Var, rj3 rj3Var2) {
        String strJoin = conversationParams == null ? "" : TextUtils.join(",", new i77(new i77(conversationParams.stunTurnServers, new u(), 1), new u(), 0));
        iqd iqdVarRetryApiCallForOutgoing = RetryKt.retryApiCallForOutgoing(this.callParams.B.j ? this.apiService.startConversationWithExternalIds(strJoin, ((hw3) this.cidProvider).a, z, this.initialOpponent, CallUtil.collectOpponentExternalIds(this.store, this.f144me.getExternalId()), this.startCallApiParams) : this.apiService.startConversation(strJoin, ((hw3) this.cidProvider).a, z, this.initialOpponent, CallUtil.collectOpponentInternalIds(this.store, this.f144me.getInternalId()), this.startCallApiParams), this.callParams.B.h, this.log);
        t tVar = new t(this, rj3Var2, conversationParams, rj3Var);
        b bVar = new b(this, rj3Var2, 0);
        iqdVarRetryApiCallForOutgoing.getClass();
        iq1 iq1Var = new iq1(tVar, 2, bVar);
        iqdVarRetryApiCallForOutgoing.k(iq1Var);
        this.disposable.a(iq1Var);
    }

    private void setupSessionRoomHandHandler(py0 py0Var) {
        py0Var.W1.a(this.sessionRoomParticipantStatesHandler);
        py0Var.W1.a.a.add(this.sessionRoomParticipantStatesHandler);
    }

    private void setupSessionRoomWatchTogetherHandler(py0 py0Var) {
        py0Var.W1.a(this.sessionRoomWatchTogetherHandler);
    }

    private void subscribeCallListeners() {
        id1 id1Var = this.call.W1;
        id1Var.b.a.add(this.listener);
        id1 id1Var2 = this.call.W1;
        id1Var2.e.a.add(this.listener);
        id1 id1Var3 = this.call.W1;
        ((CopyOnWriteArraySet) id1Var3.c.b).add(this.participantsUpdater);
        id1 id1Var4 = this.call.W1;
        id1Var4.a.a.add(this.participantsUpdater);
        this.call.W1.a(this.participantsUpdater);
        this.call.W1.a(this.sessionRoomManager);
        this.call.W1.a(this.recordManager);
        this.call.W1.a(this.asrListenerManager);
        id1 id1Var5 = this.call.W1;
        id1Var5.i.a.add(this.recordManager);
        id1 id1Var6 = this.call.W1;
        id1Var6.j.a.add(this.feedbackListenerManager);
        id1 id1Var7 = this.call.W1;
        id1Var7.m.a.add(this.asrListenerManager);
        id1 id1Var8 = this.call.W1;
        id1Var8.n.a.add(this.listener);
        id1 id1Var9 = this.call.W1;
        id1Var9.o.a.add(this.asrOnlineManager);
        id1 id1Var10 = this.call.W1;
        id1Var10.k.a.add(this.contactCallManager);
        id1 id1Var11 = this.call.W1;
        id1Var11.p.a.add(this.listener);
        id1 id1Var12 = this.call.W1;
        id1Var12.d.a.add(this.waitingRoomParticipants);
        id1 id1Var13 = this.call.W1;
        id1Var13.d.a.add(this.stereoRoomManager);
        id1 id1Var14 = this.call.W1;
        id1Var14.q.a.add(this.urlSharingListenerManager);
        this.call.W1.a(this.urlSharingListenerManager);
        id1 id1Var15 = this.call.W1;
        id1Var15.r.a.add(this.chatListenerManager);
        id1 id1Var16 = this.call.W1;
        ((CopyOnWriteArraySet) id1Var16.s.b).add(this.mediaMuteListenerManager);
        id1 id1Var17 = this.call.W1;
        id1Var17.t.a.add(this.mediaConnectionManager);
        id1 id1Var18 = this.call.W1;
        id1Var18.u.a.add(this.rateManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTalkingParticipants() {
        py0 py0Var = this.call;
        ArrayList arrayList = new ArrayList();
        for (ConversationParticipant conversationParticipant : this.store.getParticipants()) {
            fg1 callParticipant = conversationParticipant.getCallParticipant();
            boolean z = getAdjustedAudioLevel(conversationParticipant) > 0.0f;
            if (callParticipant != null && z) {
                arrayList.add(callParticipant.a);
            }
        }
        py0Var.p1.q(arrayList);
    }

    private void withInternalId(ParticipantId participantId, rj3 rj3Var) {
        withInternalId(participantId, rj3Var, null);
    }

    private void withInternalIds(Collection<ParticipantId> collection, rj3 rj3Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (ParticipantId participantId : collection) {
            bg1 byExternal = this.idMappingWrapper.getByExternal(participantId);
            if (byExternal == null) {
                arrayList.add(participantId);
            } else {
                arrayList2.add(byExternal);
            }
        }
        if (!arrayList.isEmpty()) {
            executeOnBg(new e(this, arrayList, 0), new f(rj3Var, arrayList2), null);
        } else if (rj3Var != null) {
            try {
                rj3Var.accept(arrayList2);
            } catch (Exception e) {
                this.log.reportException(LOG_TAG, "unable to use internal id", e);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addEventsListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener.add(conversationEventsListener);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addParticipant(ParticipantId participantId, final Boolean bool, final boolean z, final rj3 rj3Var) {
        withInternalIds(Collections.singletonList(participantId), new rj3() { // from class: ru.ok.android.externcalls.sdk.c
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                this.a.lambda$addParticipant$26(bool, z, rj3Var, (Collection) obj);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addParticipantByLink(String str, Runnable runnable, rj3 rj3Var) {
        this.addParticipantsCommands.addParticipantByLink(str, runnable, rj3Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addParticipants(Collection<ParticipantId> collection, final Boolean bool, final boolean z, final m56 m56Var, final m56 m56Var2) {
        withInternalIds(collection, new rj3() { // from class: ru.ok.android.externcalls.sdk.s
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                this.a.lambda$addParticipants$30(bool, z, m56Var, m56Var2, (Collection) obj);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void changeMyState(Map<String, String> map) {
        changeMyState(map, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void connect() {
        assertInited();
        py0 py0Var = this.call;
        if (py0Var.i() && !py0Var.i2) {
            py0Var.i2 = true;
            boolean z = false;
            if (!py0Var.n1.c) {
                ji9 ji9Var = py0Var.y1;
                if (ji9Var.e) {
                    ji9Var.e = false;
                    ji9Var.a();
                }
            }
            if (!py0Var.n1.d) {
                ji9 ji9Var2 = py0Var.y1;
                if (ji9Var2.f) {
                    ji9Var2.f = false;
                    ji9Var2.a();
                }
            }
            if (nsa.A().g && py0Var.y1.e) {
                if (!py0Var.n1.c && py0Var.n1.a() && py0Var.n1.c) {
                    qld qldVar = py0Var.k1;
                    qldVar.getClass();
                    qldVar.a.execute(new pld(qldVar, 0));
                } else if (nsa.A().g) {
                    qld qldVar2 = py0Var.k1;
                    qldVar2.getClass();
                    qldVar2.a.execute(new pld(qldVar2, 0));
                }
                qld qldVar3 = py0Var.k1;
                qldVar3.getClass();
                qldVar3.a.execute(new old(qldVar3, z, 0));
            }
            py0Var.V0.log("OKRTCCall", "createPeerConnectionIfReady");
            jb9.e();
            if (py0Var.P0) {
                py0Var.V0.log("OKRTCCall", "   peerConnectionCreated");
            } else {
                if (py0Var.L0 == null) {
                    throw new IllegalStateException("No ice servers");
                }
                py0Var.V0.log("OKRTCCall", "createPeerConnectionIfReady impl");
                py0Var.P0 = true;
                py0Var.c1 = true;
                py0Var.c(py0Var.t1);
                if (py0Var.n1.d) {
                    py0Var.k(w51.Z, null);
                }
            }
            py0Var.V0.log("OKRTCCall", "apply local media settings once connection requested");
            defpackage.d dVar = py0Var.l1;
            dVar.X.a.add(dVar);
            dVar.i(dVar.X);
            py0Var.x();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void createJoinLink(rj3 rj3Var, rj3 rj3Var2) {
        hc3 hc3Var = this.disposable;
        iqd iqdVarRetryApiCallForFastWorkRequired = RetryKt.retryApiCallForFastWorkRequired(this.apiService.createJoinLink(((hw3) this.cidProvider).a), this.callParams.B.h, this.log);
        Objects.requireNonNull(rj3Var);
        iw3 iw3Var = new iw3(rj3Var, 0);
        Objects.requireNonNull(rj3Var2);
        iw3 iw3Var2 = new iw3(rj3Var2, 1);
        iqdVarRetryApiCallForFastWorkRequired.getClass();
        iq1 iq1Var = new iq1(iw3Var, 2, iw3Var2);
        iqdVarRetryApiCallForFastWorkRequired.k(iq1Var);
        hc3Var.a(iq1Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public float getAdjustedAudioLevel(ConversationParticipant conversationParticipant) {
        l60 audioLevel = getAudioLevel(conversationParticipant);
        if (audioLevel == null) {
            return 0.0f;
        }
        float f = audioLevel.b;
        if (conversationParticipant == this.f144me) {
            f *= 5.0f;
        }
        if (f < AUDIO_LEVEL_MIN) {
            return 0.0f;
        }
        if (f > AUDIO_LEVEL_CLAMP_MAX) {
            return 1.0f;
        }
        return f / 9000.0f;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public rh getAnimojiControl() {
        return this.call.n2;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public AsrManager getAsrManager() {
        return this.asrManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public AsrOnlineManager getAsrOnlineManager() {
        return this.asrOnlineManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public l60 getAudioLevel(ConversationParticipant conversationParticipant) {
        wk8 wk8Var;
        if (this.f144me == conversationParticipant) {
            return this.audioSampleEnergyCalculator.getProcessor();
        }
        py0 py0Var = this.call;
        fg1 callParticipant = conversationParticipant.getCallParticipant();
        if (py0Var.A0) {
            wk8Var = null;
        } else {
            s04 s04Var = py0Var.j1;
            if (callParticipant != null) {
                wk8Var = (wk8) ((Hashtable) s04Var.d).get(callParticipant);
            } else {
                s04Var.getClass();
                wk8Var = null;
            }
        }
        if (wk8Var == null) {
            return null;
        }
        return wk8Var.a;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public int getAudioLevelFrequencyMs() {
        return this.audioLevelFrequencyMs;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public CallInfo getCallInfo() {
        return this.callInfo;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public Conversation.CallType getCallType() {
        return this.isAnswer ? Conversation.CallType.Incoming : this.isCaller ? Conversation.CallType.Outgoing : Conversation.CallType.Join;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public CameraManager getCameraManager() {
        return this.cameraManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public rx1 getCameraStatProvider() {
        tv1 tv1Var;
        kq7 kq7Var = this.call.l1.z0;
        if (kq7Var == null || (tv1Var = kq7Var.r) == null) {
            return null;
        }
        CameraVideoCapturer cameraVideoCapturer = (CameraVideoCapturer) tv1Var.c.b;
        if (cameraVideoCapturer instanceof jra) {
            return ((jra) cameraVideoCapturer).b;
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ChatManager getChatManager() {
        return this.chatManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ContactCallManager getContactCallManager() {
        return this.contactCallManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public String getConversationId() {
        return ((hw3) this.cidProvider).a;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public DebugManager getDebugManager() {
        return this.debugManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public String getDestroyReason() {
        return this.call.v0;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public DisplayLayoutSender getDisplayLayoutSender() {
        return this.displayLayoutSender;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ConversationFeatureManager getFeatureManager() {
        return this.conversationFeatureManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public FeedbackManager getFeedbackManager() {
        return this.feedbackManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public String getJoinLink() {
        String str = this.call.F0;
        if (str != null) {
            return str;
        }
        CallInfo callInfo = this.callInfo;
        return callInfo != null ? callInfo.joinLink : this.initialJoinLink;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ConversationParticipant getMe() {
        return this.f144me;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public MediaConnectionManager getMediaConnectionManager() {
        return this.mediaConnectionManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public MediaMuteManager getMediaMuteManager() {
        return this.mediaMuteManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public MicrophoneManager getMicrophoneManager() {
        return this.microphoneManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public NetworkConnectionManager getNetworkConnectionManager() {
        return this.networkConnectionManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public NoiseSuppressionManager getNoiseSuppressionManager() {
        return this.noiseSuppressionManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ConversationParticipant getOpponent() {
        Iterator<ConversationParticipant> it = this.store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next != this.f144me) {
                return next;
            }
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public wk8 getParticipantMediaStat(ConversationParticipant conversationParticipant) {
        py0 py0Var = this.call;
        fg1 callParticipant = conversationParticipant.getCallParticipant();
        if (py0Var.A0) {
            return null;
        }
        s04 s04Var = py0Var.j1;
        if (callParticipant != null) {
            return (wk8) ((Hashtable) s04Var.d).get(callParticipant);
        }
        s04Var.getClass();
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ParticipantStatesManager getParticipantStatesManager() {
        return this.participantStatesManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ParticipantCollection getParticipants() {
        return this.store;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ConversationParticipant getPinnedParticipant() {
        bg1 bg1Var;
        py0 py0Var = this.call;
        zad zadVar = py0Var.p1.k;
        if (zadVar instanceof yad) {
            tad tadVarX = py0Var.X1.x((yad) zadVar);
            bg1Var = tadVarX == null ? null : tadVarX.f;
        } else {
            bg1Var = py0Var.I1;
        }
        if (bg1Var != null) {
            return this.store.getByInternal(bg1Var);
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public RateManager getRateManager() {
        return this.rateManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public RecordManager getRecordManager() {
        return this.recordManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ji6 getRejectReason() {
        return this.call.Q0;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ScreenCaptureManager getScreenCaptureManager() {
        return this.screenCaptureManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public SessionRoomsManager getSessionRoomManager() {
        return this.sessionRoomManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public Conversation.State getState() {
        return this.state.get();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public StereoRoomManager getStereoRoomManager() {
        return this.stereoRoomManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public py0 getUnderlyingCall() {
        return this.debugManager.getUnderlyingCall();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public UrlSharingManager getUrlSharingManager() {
        return this.urlSharingManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public VideoRenderManager getVideoRenderManager() {
        return this.videoRenderManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public WatchTogetherPlayer getWatchTogetherPlayer() {
        return this.watchTogetherPlayer;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void grantRoles(ParticipantId participantId, boolean z, eg1... eg1VarArr) {
        bg1 bg1Var;
        fg1 callParticipantByExternalId = getCallParticipantByExternalId(participantId);
        if (callParticipantByExternalId == null || (bg1Var = callParticipantByExternalId.a) == null) {
            return;
        }
        grantRoles(bg1Var, z, eg1VarArr, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    @Override // ru.ok.android.externcalls.sdk.Conversation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void hangup(defpackage.ii6 r3) {
        /*
            r2 = this;
            py0 r0 = r2.call
            r0.getClass()
            ji6 r3 = r3.a
            if (r3 != 0) goto L28
            boolean r3 = r0.B0
            ji6 r1 = defpackage.ji6.o
            if (r3 == 0) goto L1f
            boolean r3 = r0.s()
            if (r3 != 0) goto L1d
            boolean r3 = r0.C1
            if (r3 != 0) goto L1a
            goto L1d
        L1a:
            ji6 r3 = defpackage.ji6.X
            goto L28
        L1d:
            r3 = r1
            goto L28
        L1f:
            boolean r3 = r0.s()
            if (r3 == 0) goto L26
            goto L1d
        L26:
            ji6 r3 = defpackage.ji6.c
        L28:
            r0.d(r3)
            r3 = 1
            r2.wasHungUp = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.hangup(ii6):void");
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean hasRegisteredParticipnats() {
        for (fg1 fg1Var : this.call.p1.i()) {
            if (fg1Var.j != null || !fg1Var.f.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // ru.ok.android.externcalls.sdk.Conversation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init() {
        /*
            r4 = this;
            a4c r0 = r4.log
            java.lang.String r1 = "Conversation"
            java.lang.String r2 = "init called"
            r0.log(r1, r2)
            r4.doStartCall()
            ru.ok.android.externcalls.sdk.conversation.StartCallApiParams r0 = r4.startCallApiParams
            boolean r0 = r0.getIsVideo()
            if (r0 == 0) goto L2e
            py0 r0 = r4.call
            kd1 r1 = r0.L1
            hi9 r2 = r1.i
            rd8 r2 = r2.b
            rd8 r3 = defpackage.rd8.a
            if (r2 != r3) goto L2e
            kg1 r0 = r0.p1
            zad r0 = r0.k
            hi9 r0 = r1.h(r0)
            rd8 r0 = r0.b
            if (r0 != r3) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            py0 r1 = r4.call
            r1.B(r0)
            py0 r4 = r4.call
            r4.G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationImpl.init():void");
    }

    public void initAsConfJoin() {
        this.expectedChat = true;
    }

    public void initStore(Collection<ParticipantId> collection) {
        boolean z = collection.size() > 1;
        if (z && this.isCaller) {
            ExtLogger extLogger = this.stat;
            d4a d4aVarSimpleBuilder = ExtLogger.simpleBuilder(e0e.callStartMultiparty);
            d4aVarSimpleBuilder.c("vcid", ((hw3) this.cidProvider).a);
            extLogger.log(d4aVarSimpleBuilder.a());
        }
        Iterator<ParticipantId> it = collection.iterator();
        while (it.hasNext()) {
            ConversationParticipant conversationParticipantFromExternal = ConversationParticipant.fromExternal(it.next(), this.idMappingWrapper);
            this.store.addToActiveSessionRoom(conversationParticipantFromExternal);
            if (!z) {
                this.initialOpponent = conversationParticipantFromExternal;
                conversationParticipantFromExternal.setReported(true);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isAnonJoinForbidden() {
        py0 py0Var = this.call;
        return py0Var.z0.contains(oy0.a);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isAnswered() {
        return this.call.s();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isAudioMixEnabled() {
        return this.call.t1.H(xxe.c);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isCaller() {
        return this.isCaller;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isConcurrent() {
        return this.isConcurrent;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public boolean isConditionAccepted() {
        return this.call.T0.b;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isConnected() {
        return this.call.K0;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isDestroyed() {
        return this.state.get() == Conversation.State.Finished;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isFeatureAddParticipantEnabled() {
        return this.call.x1;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isFeedbackEnabled() {
        py0 py0Var = this.call;
        return py0Var.z0.contains(oy0.o);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isGroupCall() {
        return this.call.p1.r() > 1;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isInited() {
        return this.inited;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isInitialVideoEnabled() {
        return this.call.E0;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isMeCreatorOrAdmin() {
        return py0.t(this.call.p1.a);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isMeInWaitingRoom() {
        return this.call.K1;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isMuteParticipantsPermitted() {
        return this.call.a;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public boolean isParticipantAdmin(String str) {
        fg1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        this.call.getClass();
        Iterator it = callParticipant.e.iterator();
        while (it.hasNext()) {
            if (((eg1) it.next()) == eg1.b) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public boolean isParticipantCreator(String str) {
        fg1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        this.call.getClass();
        Iterator it = callParticipant.e.iterator();
        while (it.hasNext()) {
            if (((eg1) it.next()) == eg1.a) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isParticipantCreatorOrAdmin(String str) {
        fg1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        this.call.getClass();
        return py0.t(callParticipant);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isPermissionsGranted() {
        aq7 aq7Var = this.call.n1;
        return aq7Var.d || aq7Var.c || (aq7Var.a() && (aq7Var.d || aq7Var.c));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isPrepared() {
        return this.prepared;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isRecurring() {
        py0 py0Var = this.call;
        return py0Var.z0.contains(oy0.c);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isVideoPermissionGranted() {
        py0 py0Var = this.call;
        return py0Var.n1.d || (py0Var.n1.a() && py0Var.n1.d);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isWaitingRoomEnabled() {
        py0 py0Var = this.call;
        return py0Var.z0.contains(oy0.b);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void muteAll() {
        rod rodVar = this.call.Z;
        if (rodVar != null) {
            try {
                rodVar.i(f46.b(new JSONObject().put("all", true).put("muteTarget", true), "switch-micro"));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [by0] */
    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void pinParticipant(ParticipantId participantId, final boolean z) {
        final bg1 bg1Var;
        fg1 callParticipantByExternalId = getCallParticipantByExternalId(participantId);
        if (callParticipantByExternalId == null || (bg1Var = callParticipantByExternalId.a) == null) {
            return;
        }
        final py0 py0Var = this.call;
        final zad zadVar = py0Var.p1.k;
        py0Var.t1.K(bg1Var, zadVar, z, new qod() { // from class: by0
            @Override // defpackage.qod
            public final void j(JSONObject jSONObject) {
                py0 py0Var2 = py0Var;
                py0Var2.getClass();
                if (jSONObject.optString("error").isEmpty()) {
                    boolean z2 = z;
                    bg1 bg1Var2 = bg1Var;
                    bg1 bg1Var3 = z2 ? bg1Var2 : null;
                    zad zadVar2 = zadVar;
                    if (zadVar2 instanceof yad) {
                        py0Var2.Y1.b(!z2, bg1Var2, (yad) zadVar2);
                    } else {
                        py0Var2.I1 = bg1Var3;
                    }
                    py0Var2.k(w51.J0, bg1Var3);
                }
            }
        });
    }

    public void prepare(ConversationParams conversationParams, rj3 rj3Var, rj3 rj3Var2) {
        prepare(conversationParams, false, false, rj3Var, rj3Var2);
    }

    public void prepareJoinByLink(final rj3 rj3Var, final rj3 rj3Var2, String str) {
        this.anonToken = str;
        hc3 hc3Var = this.disposable;
        iqd iqdVarExecuteWithState = executeWithState(Conversation.State.None, Conversation.State.Preparing, createConversationPrepare(null), new Prepare.PrepareParams.PrepareJoin(this.initialJoinLink, str));
        qj3 qj3Var = new qj3() { // from class: ru.ok.android.externcalls.sdk.h
            @Override // defpackage.qj3
            public final void accept(Object obj) throws Throwable {
                this.a.lambda$prepareJoinByLink$9(rj3Var2, rj3Var, (Prepare.PrepareResult) obj);
            }
        };
        i iVar = new i(rj3Var2, 0);
        iqdVarExecuteWithState.getClass();
        iq1 iq1Var = new iq1(qj3Var, 2, iVar);
        iqdVarExecuteWithState.k(iq1Var);
        hc3Var.a(iq1Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void promoteParticipant(ParticipantId participantId, boolean z) {
        withInternalId(participantId, new d(this, z, 1));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void queryChatHistory(Integer num, Integer num2, final Conversation.ChatHistoryCallback chatHistoryCallback) {
        rod rodVar = this.call.Z;
        if (rodVar != null) {
            try {
                ka6 ka6VarB = f46.b(null, "chat-history");
                JSONObject jSONObject = ka6VarB.a;
                jSONObject.put("offset", num.intValue());
                jSONObject.put(NewHtcHomeBadger.COUNT, num2.intValue());
                rodVar.h(ka6VarB, new qod() { // from class: ru.ok.android.externcalls.sdk.g
                    @Override // defpackage.qod
                    public final void j(JSONObject jSONObject2) throws JSONException {
                        this.a.lambda$queryChatHistory$38(chatHistoryCallback, jSONObject2);
                    }
                });
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void release() {
        SupportedCodecsStatistics.tryToReport(this.api, this.preferencesHelper, this.log, this.callParams);
        this.rateManager.logHints();
        this.disposable.d();
        this.waitingRoomParticipants.release();
        this.participantStatesManager.release();
        this.mediaConnectionManager.release();
        synchronized (this.stateTransitionLock) {
            try {
                if (this.wantsApiHangup && this.wasHungUp) {
                    ji6 ji6Var = this.call.Q0;
                    if (ji6Var == null) {
                        ji6Var = ji6.X;
                    }
                    this.creator.hangup(ji6Var, ((hw3) this.cidProvider).a, this.anonToken);
                }
                this.call.w1 = null;
                py0 py0Var = this.call;
                py0Var.d1 = null;
                py0Var.M0.remove(this.listener);
                py0 py0Var2 = this.call;
                AudioSampleEnergyCalculator audioSampleEnergyCalculator = this.audioSampleEnergyCalculator;
                qld qldVar = py0Var2.k1;
                qldVar.getClass();
                qldVar.a.execute(new flc(qldVar, 17, audioSampleEnergyCalculator));
                this.call.p(null, "release");
                this.state.set(Conversation.State.Finished);
                this.listener.release();
                this.eventListener.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeEventsListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener.remove(conversationEventsListener);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeJoinLink(Runnable runnable, rj3 rj3Var) {
        hc3 hc3Var = this.disposable;
        qpc qpcVarC = this.api.c();
        rk0 rk0VarS = tu0.s("vchat.removeJoinLink");
        rk0VarS.b = kl.c;
        rk0VarS.b(ApiProtocol.PARAM_CONVERSATION_ID, ((hw3) this.cidProvider).a);
        drd drdVarI = RetryKt.retryApiCallForFastWorkRequired(qpcVarC.a(rk0VarS.a(new UnwrappingParser("success", new ig5(29)))), this.callParams.B.h, this.log).i(ce.a());
        b bVar = new b(runnable, rj3Var, 2);
        Objects.requireNonNull(rj3Var);
        iq1 iq1Var = new iq1(bVar, 2, new iw3(rj3Var, 1));
        drdVarI.k(iq1Var);
        hc3Var.a(iq1Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeParticipant(ParticipantId participantId) {
        removeParticipant(participantId, false);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void sendData(ConversationParticipant conversationParticipant, JSONObject jSONObject) {
        bg1 bg1Var;
        if (this.call.A0 || conversationParticipant == null || (bg1Var = conversationParticipant.getCallParticipant().a) == null) {
            return;
        }
        this.call.Z.i(f46.j(bg1Var, jSONObject));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setAnonJoinForbidden(boolean z) {
        setAnonJoinForbidden(z, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setAudioCaptureEnabled(boolean z) {
        this.screenCaptureManager.setAudioCaptureEnabled(z);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setCallOptionEnabled(final oy0 oy0Var, final boolean z, final rj3 rj3Var) {
        rod rodVar = this.call.Z;
        if (!isMeCreatorOrAdmin()) {
            if (rj3Var != null) {
                rj3Var.accept("user is not creator or admin");
            }
            this.log.log(LOG_TAG, "user is not creator or admin");
        } else if (rodVar != null) {
            Set setSingleton = Collections.singleton(oy0Var);
            rodVar.d(z ? f46.h(setSingleton, null) : f46.h(null, setSingleton), false, new qod() { // from class: ru.ok.android.externcalls.sdk.m
                @Override // defpackage.qod
                public final void j(JSONObject jSONObject) throws JSONException {
                    this.a.lambda$setCallOptionEnabled$23(z, oy0Var, rj3Var, jSONObject);
                }
            }, new k(rj3Var, 1));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setFeedbackEnabled(boolean z) {
        setFeedbackEnabled(z, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setMuteState(ParticipantId participantId, boolean z) {
        rod rodVar = this.call.Z;
        if (rodVar != null) {
            withInternalId(participantId, new d(rodVar, z, 2));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setWaitingRoomEnabled(boolean z) {
        setWaitingRoomEnabled(z, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void withInternalId(ParticipantId participantId, rj3 rj3Var, Runnable runnable) {
        bg1 byExternal = this.idMappingWrapper.getByExternal(participantId);
        if (byExternal == null) {
            executeOnBg(new e(this, participantId, 1), new f(participantId, rj3Var), runnable);
            return;
        }
        try {
            rj3Var.accept(byExternal);
        } catch (Exception e) {
            if (runnable != null) {
                runnable.run();
            }
            this.log.reportException(LOG_TAG, "unable to use internal id", e);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public void addParticipant(String str, final boolean z, final rj3 rj3Var) {
        sk0 sk0VarResolveInternalRequest = IdUtils.resolveInternalRequest(str, false);
        hc3 hc3Var = this.disposable;
        drd drdVarI = RetryKt.retryApiCallForFastWorkRequired(this.api.c().a(sk0VarResolveInternalRequest), this.callParams.B.h, this.log).i(ce.a());
        iq1 iq1Var = new iq1(new qj3() { // from class: ru.ok.android.externcalls.sdk.j
            @Override // defpackage.qj3
            public final void accept(Object obj) throws Throwable {
                this.a.lambda$addParticipant$28(z, rj3Var, (InternalIdResponse) obj);
            }
        }, 2, new p(this));
        drdVarI.k(iq1Var);
        hc3Var.a(iq1Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void changeMyState(Map<String, String> map, qod qodVar) {
        this.participantStatesManager.updateOwnState(map, qodVar);
    }

    public void prepare(ConversationParams conversationParams, final boolean z, final boolean z2, final rj3 rj3Var, final rj3 rj3Var2) {
        iqd iqdVarExecuteWithState = executeWithState(Conversation.State.None, Conversation.State.Preparing, createConversationPrepare(conversationParams), Prepare.PrepareParams.C0003Prepare.INSTANCE);
        qj3 qj3Var = new qj3() { // from class: ru.ok.android.externcalls.sdk.l
            @Override // defpackage.qj3
            public final void accept(Object obj) throws Throwable {
                this.a.lambda$prepare$7(z, rj3Var2, z2, rj3Var, (Prepare.PrepareResult) obj);
            }
        };
        i iVar = new i(rj3Var2, 1);
        iqdVarExecuteWithState.getClass();
        iq1 iq1Var = new iq1(qj3Var, 2, iVar);
        iqdVarExecuteWithState.k(iq1Var);
        this.disposable.a(iq1Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeParticipant(ParticipantId participantId, boolean z) {
        withInternalId(participantId, new d(this, z, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setAnonJoinForbidden(boolean z, rj3 rj3Var) {
        setCallOptionEnabled(oy0.a, z, rj3Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setFeedbackEnabled(boolean z, rj3 rj3Var) {
        setCallOptionEnabled(oy0.o, z, rj3Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setWaitingRoomEnabled(boolean z, rj3 rj3Var) {
        setCallOptionEnabled(oy0.b, z, rj3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [ay0] */
    public void grantRoles(final bg1 bg1Var, final boolean z, eg1[] eg1VarArr, final Runnable runnable, final Runnable runnable2) {
        final py0 py0Var = this.call;
        final List listAsList = Arrays.asList(eg1VarArr);
        py0Var.t1.E(bg1Var, listAsList, z, new qod() { // from class: ay0
            @Override // defpackage.qod
            public final void j(JSONObject jSONObject) {
                fg1 fg1Var;
                py0 py0Var2 = py0Var;
                py0Var2.getClass();
                if (!jSONObject.optString("error").isEmpty()) {
                    Runnable runnable3 = runnable2;
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
                kg1 kg1Var = py0Var2.p1;
                kg1Var.getClass();
                LinkedHashSet<fg1> linkedHashSet = new LinkedHashSet();
                fg1 fg1Var2 = kg1Var.a;
                bg1 bg1Var2 = fg1Var2.a;
                bg1 bg1Var3 = bg1Var;
                if (bg1Var2 == null || !bg1Var2.equals(bg1Var3)) {
                    Set<bg1> set = (Set) kg1Var.h.get(bg1Var3.a);
                    if (set != null) {
                        for (bg1 bg1Var4 : set) {
                            zad zadVar = (zad) kg1Var.g.get(bg1Var4);
                            if (zadVar != null && (fg1Var = (fg1) kg1Var.d(zadVar).get(bg1Var4)) != null) {
                                linkedHashSet.add(fg1Var);
                            }
                        }
                    }
                } else {
                    linkedHashSet.add(fg1Var2);
                }
                if (!linkedHashSet.isEmpty()) {
                    for (fg1 fg1Var3 : linkedHashSet) {
                        boolean z2 = z;
                        List list = listAsList;
                        if (z2) {
                            fg1Var3.d.removeAll(list);
                        } else {
                            fg1Var3.d.addAll(list);
                        }
                    }
                    py0Var2.k(w51.H0, linkedHashSet);
                }
                Runnable runnable4 = runnable;
                if (runnable4 != null) {
                    runnable4.run();
                }
            }
        });
    }
}

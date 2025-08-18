package ru.ok.tamtam.android.prefs;

import androidx.annotation.Keep;
import defpackage.e5b;
import defpackage.je7;
import defpackage.khe;
import defpackage.mz7;
import defpackage.s4a;
import defpackage.u25;
import defpackage.v25;
import defpackage.z53;
import defpackage.zr6;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.apache.http.HttpStatus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\b\u009e\u0001\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001¨\u0006¢\u0001"}, d2 = {"Lru/ok/tamtam/android/prefs/PmsKey;", "", "<init>", "(Ljava/lang/String;I)V", "", "toString", "()Ljava/lang/String;", "fullContentString$prefs_release", "fullContentString", "Companion", "e5b", "set-unread-timeout", "proxy", "video-preview", "debug-mode", "proxy-domains", "image-width", "image-height", "image-quality", "image-size", "max-msg-length", "max-participants", "max-audio-length", "max-theme-length", "max-description-length", "edit-timeout", "chats-page-size", "keep-connection", "sticker-sections", "stickers-suggestion", "invite-link", "invite-short", "invite-long", "invite-header", "max-cname-length", "v-size-grp", "t-ice-reconnect", "file-upload-max-size", "file-upload-unsupported-types", "music-files-enabled", "chats-preload-period", "max-favorite-chats", "disconnect-timeout", "max-attach-count", "push-alert-timeout", "live-location-enabled", "live-location-release-date", "live-location-send-timeout", "support-account", "support-email", "wakelock-on-push", "mentions_entity_names_limit", "max-readmarks", "max-video-duration-download", "talking-on-muted-mic-trigger-diff", "max-favorite-stickers", "max-favorite-sticker-sets", "min-sticker-size", "max-sticker-size", "default-sticker-size", "min-image-side-size", "min-duration-save-audio-start-time", "valid-interval-audio-start-time", "min-duration-playback-speed", "drafts-sync-enabled", "audio-transcription-locales", "scheduled-messages-enabled", "tracer-non-fatal-crashed-enabled", "subscription-timeout-seconds", "double-tap-reaction", "reactions-max", "react-errors", "msg-get-reactions-page-size", "wm-workers-limit", "wm-check-workers-count-interval-sec", "wm-backlog-worker-check-delay-sec", "wm-backlog-worker-backoff-delay-sec", "wm-workers-offset", "wm-analytics-enabled", "progress-diff-for-notify", "worker-progress-time-diff-for-notify-ms", "max-downloaded-size-for-notify-kb", "fb-exec-replace", "fb-exec-modifiers-names", "log-full", "log-sensitive", "anr-config", "debug-profile-info", "calls-endpoint", "fake-chats", "channels-enabled", "available-complaints", "in-app-review-triggers", "fake-in-app-review", "invite-friends-sheet-frequency", "welcome-sticker-ids", "money-transfer-botid", "non-contact-sync-time", "non-contact-max-chunk-size", "non-contact-collection-interval", "edit-chat-type-screen-enabled", "gce", "lgce", "sse", "gsse", "grse", "gcas", "gcwre", "gcmpe", "group-call-chat-support", "account-nickname-enabled", "send-location-enabled", "reconnect-call-ringtone", "new-media-viewer-enabled", "media-viewer-video-collage-enabled", "new-uploader-enabled", "mytracker-enabled", "chat-video-autoplay-parallel-count", "chat-complaint-enabled", "bot-complaint-enabled", "calls-sdk-audio-dynamic-redundancy", "calls-sdk-net-disable-shared-socket", "conn-timeouts", "safe-mode-enabled", "media-transform", "max-rate-call-threshold", "call-minimum-duration-to-rate", "call-rate", "send-queue-size", "webapp-ds-keys-count", "webapp-ss-keys-count", "webapp-biometry-enabled", "ext-sharing-video", "chat-invite-link-permissions-enabled", "chat-animoji-enabled", "edit-channel-type-screen-enabled", "chat-anim", "send-logs-interval-sec", "saved-messages-aliases", "video-msg-enabled", "analytics-permissions", "stat-session-background-threshold", "bot-start-param", "js-download-delegate", "esia-enabled", "new-admin-permissions", "media-order", "bad-networ-indicator-config", "webm-stickers-enabled", "avatars-screen-enabled", "new-session-logic", "analytics-enabled", "mytracker-log-level", "show-vpn-snackbar", "search-webapps-showcase", "unsafe-files-alert", "player-load-control", "new-settings-storage-screen-enabled", "max-video-message-length", "settings-entry-banners", "appearance-multi-theme-screen-enabled", "net-client-dns-enabled", "prefs_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class PmsKey {
    private static final /* synthetic */ u25 $ENTRIES;
    private static final /* synthetic */ PmsKey[] $VALUES;
    public static final e5b Companion;
    private static final je7 keys$delegate;

    /* renamed from: set-unread-timeout, reason: not valid java name */
    public static final PmsKey f113setunreadtimeout = new PmsKey("set-unread-timeout", 0);
    public static final PmsKey proxy = new PmsKey("proxy", 1);

    /* renamed from: video-preview, reason: not valid java name */
    public static final PmsKey f129videopreview = new PmsKey("video-preview", 2);

    /* renamed from: debug-mode, reason: not valid java name */
    public static final PmsKey f27debugmode = new PmsKey("debug-mode", 3);

    /* renamed from: proxy-domains, reason: not valid java name */
    public static final PmsKey f101proxydomains = new PmsKey("proxy-domains", 4);

    /* renamed from: image-width, reason: not valid java name */
    public static final PmsKey f48imagewidth = new PmsKey("image-width", 5);

    /* renamed from: image-height, reason: not valid java name */
    public static final PmsKey f45imageheight = new PmsKey("image-height", 6);

    /* renamed from: image-quality, reason: not valid java name */
    public static final PmsKey f46imagequality = new PmsKey("image-quality", 7);

    /* renamed from: image-size, reason: not valid java name */
    public static final PmsKey f47imagesize = new PmsKey("image-size", 8);

    /* renamed from: max-msg-length, reason: not valid java name */
    public static final PmsKey f70maxmsglength = new PmsKey("max-msg-length", 9);

    /* renamed from: max-participants, reason: not valid java name */
    public static final PmsKey f71maxparticipants = new PmsKey("max-participants", 10);

    /* renamed from: max-audio-length, reason: not valid java name */
    public static final PmsKey f63maxaudiolength = new PmsKey("max-audio-length", 11);

    /* renamed from: max-theme-length, reason: not valid java name */
    public static final PmsKey f75maxthemelength = new PmsKey("max-theme-length", 12);

    /* renamed from: max-description-length, reason: not valid java name */
    public static final PmsKey f65maxdescriptionlength = new PmsKey("max-description-length", 13);

    /* renamed from: edit-timeout, reason: not valid java name */
    public static final PmsKey f35edittimeout = new PmsKey("edit-timeout", 14);

    /* renamed from: chats-page-size, reason: not valid java name */
    public static final PmsKey f24chatspagesize = new PmsKey("chats-page-size", 15);

    /* renamed from: keep-connection, reason: not valid java name */
    public static final PmsKey f56keepconnection = new PmsKey("keep-connection", 16);

    /* renamed from: sticker-sections, reason: not valid java name */
    public static final PmsKey f117stickersections = new PmsKey("sticker-sections", 17);

    /* renamed from: stickers-suggestion, reason: not valid java name */
    public static final PmsKey f118stickerssuggestion = new PmsKey("stickers-suggestion", 18);

    /* renamed from: invite-link, reason: not valid java name */
    public static final PmsKey f52invitelink = new PmsKey("invite-link", 19);

    /* renamed from: invite-short, reason: not valid java name */
    public static final PmsKey f54inviteshort = new PmsKey("invite-short", 20);

    /* renamed from: invite-long, reason: not valid java name */
    public static final PmsKey f53invitelong = new PmsKey("invite-long", 21);

    /* renamed from: invite-header, reason: not valid java name */
    public static final PmsKey f51inviteheader = new PmsKey("invite-header", 22);

    /* renamed from: max-cname-length, reason: not valid java name */
    public static final PmsKey f64maxcnamelength = new PmsKey("max-cname-length", 23);

    /* renamed from: v-size-grp, reason: not valid java name */
    public static final PmsKey f126vsizegrp = new PmsKey("v-size-grp", 24);

    /* renamed from: t-ice-reconnect, reason: not valid java name */
    public static final PmsKey f122ticereconnect = new PmsKey("t-ice-reconnect", 25);

    /* renamed from: file-upload-max-size, reason: not valid java name */
    public static final PmsKey f42fileuploadmaxsize = new PmsKey("file-upload-max-size", 26);

    /* renamed from: file-upload-unsupported-types, reason: not valid java name */
    public static final PmsKey f43fileuploadunsupportedtypes = new PmsKey("file-upload-unsupported-types", 27);

    /* renamed from: music-files-enabled, reason: not valid java name */
    public static final PmsKey f87musicfilesenabled = new PmsKey("music-files-enabled", 28);

    /* renamed from: chats-preload-period, reason: not valid java name */
    public static final PmsKey f25chatspreloadperiod = new PmsKey("chats-preload-period", 29);

    /* renamed from: max-favorite-chats, reason: not valid java name */
    public static final PmsKey f67maxfavoritechats = new PmsKey("max-favorite-chats", 30);

    /* renamed from: disconnect-timeout, reason: not valid java name */
    public static final PmsKey f30disconnecttimeout = new PmsKey("disconnect-timeout", 31);

    /* renamed from: max-attach-count, reason: not valid java name */
    public static final PmsKey f62maxattachcount = new PmsKey("max-attach-count", 32);

    /* renamed from: push-alert-timeout, reason: not valid java name */
    public static final PmsKey f102pushalerttimeout = new PmsKey("push-alert-timeout", 33);

    /* renamed from: live-location-enabled, reason: not valid java name */
    public static final PmsKey f57livelocationenabled = new PmsKey("live-location-enabled", 34);

    /* renamed from: live-location-release-date, reason: not valid java name */
    public static final PmsKey f58livelocationreleasedate = new PmsKey("live-location-release-date", 35);

    /* renamed from: live-location-send-timeout, reason: not valid java name */
    public static final PmsKey f59livelocationsendtimeout = new PmsKey("live-location-send-timeout", 36);

    /* renamed from: support-account, reason: not valid java name */
    public static final PmsKey f120supportaccount = new PmsKey("support-account", 37);

    /* renamed from: support-email, reason: not valid java name */
    public static final PmsKey f121supportemail = new PmsKey("support-email", 38);

    /* renamed from: wakelock-on-push, reason: not valid java name */
    public static final PmsKey f130wakelockonpush = new PmsKey("wakelock-on-push", 39);
    public static final PmsKey mentions_entity_names_limit = new PmsKey("mentions_entity_names_limit", 40);

    /* renamed from: max-readmarks, reason: not valid java name */
    public static final PmsKey f73maxreadmarks = new PmsKey("max-readmarks", 41);

    /* renamed from: max-video-duration-download, reason: not valid java name */
    public static final PmsKey f76maxvideodurationdownload = new PmsKey("max-video-duration-download", 42);

    /* renamed from: talking-on-muted-mic-trigger-diff, reason: not valid java name */
    public static final PmsKey f123talkingonmutedmictriggerdiff = new PmsKey("talking-on-muted-mic-trigger-diff", 43);

    /* renamed from: max-favorite-stickers, reason: not valid java name */
    public static final PmsKey f69maxfavoritestickers = new PmsKey("max-favorite-stickers", 44);

    /* renamed from: max-favorite-sticker-sets, reason: not valid java name */
    public static final PmsKey f68maxfavoritestickersets = new PmsKey("max-favorite-sticker-sets", 45);

    /* renamed from: min-sticker-size, reason: not valid java name */
    public static final PmsKey f84minstickersize = new PmsKey("min-sticker-size", 46);

    /* renamed from: max-sticker-size, reason: not valid java name */
    public static final PmsKey f74maxstickersize = new PmsKey("max-sticker-size", 47);

    /* renamed from: default-sticker-size, reason: not valid java name */
    public static final PmsKey f29defaultstickersize = new PmsKey("default-sticker-size", 48);

    /* renamed from: min-image-side-size, reason: not valid java name */
    public static final PmsKey f83minimagesidesize = new PmsKey("min-image-side-size", 49);

    /* renamed from: min-duration-save-audio-start-time, reason: not valid java name */
    public static final PmsKey f82mindurationsaveaudiostarttime = new PmsKey("min-duration-save-audio-start-time", 50);

    /* renamed from: valid-interval-audio-start-time, reason: not valid java name */
    public static final PmsKey f127validintervalaudiostarttime = new PmsKey("valid-interval-audio-start-time", 51);

    /* renamed from: min-duration-playback-speed, reason: not valid java name */
    public static final PmsKey f81mindurationplaybackspeed = new PmsKey("min-duration-playback-speed", 52);

    /* renamed from: drafts-sync-enabled, reason: not valid java name */
    public static final PmsKey f32draftssyncenabled = new PmsKey("drafts-sync-enabled", 53);

    /* renamed from: audio-transcription-locales, reason: not valid java name */
    public static final PmsKey f7audiotranscriptionlocales = new PmsKey("audio-transcription-locales", 54);

    /* renamed from: scheduled-messages-enabled, reason: not valid java name */
    public static final PmsKey f108scheduledmessagesenabled = new PmsKey("scheduled-messages-enabled", 55);

    /* renamed from: tracer-non-fatal-crashed-enabled, reason: not valid java name */
    public static final PmsKey f124tracernonfatalcrashedenabled = new PmsKey("tracer-non-fatal-crashed-enabled", 56);

    /* renamed from: subscription-timeout-seconds, reason: not valid java name */
    public static final PmsKey f119subscriptiontimeoutseconds = new PmsKey("subscription-timeout-seconds", 57);

    /* renamed from: double-tap-reaction, reason: not valid java name */
    public static final PmsKey f31doubletapreaction = new PmsKey("double-tap-reaction", 58);

    /* renamed from: reactions-max, reason: not valid java name */
    public static final PmsKey f104reactionsmax = new PmsKey("reactions-max", 59);

    /* renamed from: react-errors, reason: not valid java name */
    public static final PmsKey f103reacterrors = new PmsKey("react-errors", 60);

    /* renamed from: msg-get-reactions-page-size, reason: not valid java name */
    public static final PmsKey f86msggetreactionspagesize = new PmsKey("msg-get-reactions-page-size", 61);

    /* renamed from: wm-workers-limit, reason: not valid java name */
    public static final PmsKey f140wmworkerslimit = new PmsKey("wm-workers-limit", 62);

    /* renamed from: wm-check-workers-count-interval-sec, reason: not valid java name */
    public static final PmsKey f139wmcheckworkerscountintervalsec = new PmsKey("wm-check-workers-count-interval-sec", 63);

    /* renamed from: wm-backlog-worker-check-delay-sec, reason: not valid java name */
    public static final PmsKey f138wmbacklogworkercheckdelaysec = new PmsKey("wm-backlog-worker-check-delay-sec", 64);

    /* renamed from: wm-backlog-worker-backoff-delay-sec, reason: not valid java name */
    public static final PmsKey f137wmbacklogworkerbackoffdelaysec = new PmsKey("wm-backlog-worker-backoff-delay-sec", 65);

    /* renamed from: wm-workers-offset, reason: not valid java name */
    public static final PmsKey f141wmworkersoffset = new PmsKey("wm-workers-offset", 66);

    /* renamed from: wm-analytics-enabled, reason: not valid java name */
    public static final PmsKey f136wmanalyticsenabled = new PmsKey("wm-analytics-enabled", 67);

    /* renamed from: progress-diff-for-notify, reason: not valid java name */
    public static final PmsKey f100progressdifffornotify = new PmsKey("progress-diff-for-notify", 68);

    /* renamed from: worker-progress-time-diff-for-notify-ms, reason: not valid java name */
    public static final PmsKey f142workerprogresstimedifffornotifyms = new PmsKey("worker-progress-time-diff-for-notify-ms", 69);

    /* renamed from: max-downloaded-size-for-notify-kb, reason: not valid java name */
    public static final PmsKey f66maxdownloadedsizefornotifykb = new PmsKey("max-downloaded-size-for-notify-kb", 70);

    /* renamed from: fb-exec-replace, reason: not valid java name */
    public static final PmsKey f41fbexecreplace = new PmsKey("fb-exec-replace", 71);

    /* renamed from: fb-exec-modifiers-names, reason: not valid java name */
    public static final PmsKey f40fbexecmodifiersnames = new PmsKey("fb-exec-modifiers-names", 72);

    /* renamed from: log-full, reason: not valid java name */
    public static final PmsKey f60logfull = new PmsKey("log-full", 73);

    /* renamed from: log-sensitive, reason: not valid java name */
    public static final PmsKey f61logsensitive = new PmsKey("log-sensitive", 74);

    /* renamed from: anr-config, reason: not valid java name */
    public static final PmsKey f5anrconfig = new PmsKey("anr-config", 75);

    /* renamed from: debug-profile-info, reason: not valid java name */
    public static final PmsKey f28debugprofileinfo = new PmsKey("debug-profile-info", 76);

    /* renamed from: calls-endpoint, reason: not valid java name */
    public static final PmsKey f15callsendpoint = new PmsKey("calls-endpoint", 77);

    /* renamed from: fake-chats, reason: not valid java name */
    public static final PmsKey f38fakechats = new PmsKey("fake-chats", 78);

    /* renamed from: channels-enabled, reason: not valid java name */
    public static final PmsKey f18channelsenabled = new PmsKey("channels-enabled", 79);

    /* renamed from: available-complaints, reason: not valid java name */
    public static final PmsKey f8availablecomplaints = new PmsKey("available-complaints", 80);

    /* renamed from: in-app-review-triggers, reason: not valid java name */
    public static final PmsKey f49inappreviewtriggers = new PmsKey("in-app-review-triggers", 81);

    /* renamed from: fake-in-app-review, reason: not valid java name */
    public static final PmsKey f39fakeinappreview = new PmsKey("fake-in-app-review", 82);

    /* renamed from: invite-friends-sheet-frequency, reason: not valid java name */
    public static final PmsKey f50invitefriendssheetfrequency = new PmsKey("invite-friends-sheet-frequency", 83);

    /* renamed from: welcome-sticker-ids, reason: not valid java name */
    public static final PmsKey f135welcomestickerids = new PmsKey("welcome-sticker-ids", 84);

    /* renamed from: money-transfer-botid, reason: not valid java name */
    public static final PmsKey f85moneytransferbotid = new PmsKey("money-transfer-botid", 85);

    /* renamed from: non-contact-sync-time, reason: not valid java name */
    public static final PmsKey f98noncontactsynctime = new PmsKey("non-contact-sync-time", 86);

    /* renamed from: non-contact-max-chunk-size, reason: not valid java name */
    public static final PmsKey f97noncontactmaxchunksize = new PmsKey("non-contact-max-chunk-size", 87);

    /* renamed from: non-contact-collection-interval, reason: not valid java name */
    public static final PmsKey f96noncontactcollectioninterval = new PmsKey("non-contact-collection-interval", 88);

    /* renamed from: edit-chat-type-screen-enabled, reason: not valid java name */
    public static final PmsKey f34editchattypescreenenabled = new PmsKey("edit-chat-type-screen-enabled", 89);
    public static final PmsKey gce = new PmsKey("gce", 90);
    public static final PmsKey lgce = new PmsKey("lgce", 91);
    public static final PmsKey sse = new PmsKey("sse", 92);
    public static final PmsKey gsse = new PmsKey("gsse", 93);
    public static final PmsKey grse = new PmsKey("grse", 94);
    public static final PmsKey gcas = new PmsKey("gcas", 95);
    public static final PmsKey gcwre = new PmsKey("gcwre", 96);
    public static final PmsKey gcmpe = new PmsKey("gcmpe", 97);

    /* renamed from: group-call-chat-support, reason: not valid java name */
    public static final PmsKey f44groupcallchatsupport = new PmsKey("group-call-chat-support", 98);

    /* renamed from: account-nickname-enabled, reason: not valid java name */
    public static final PmsKey f2accountnicknameenabled = new PmsKey("account-nickname-enabled", 99);

    /* renamed from: send-location-enabled, reason: not valid java name */
    public static final PmsKey f110sendlocationenabled = new PmsKey("send-location-enabled", 100);

    /* renamed from: reconnect-call-ringtone, reason: not valid java name */
    public static final PmsKey f105reconnectcallringtone = new PmsKey("reconnect-call-ringtone", HttpStatus.SC_SWITCHING_PROTOCOLS);

    /* renamed from: new-media-viewer-enabled, reason: not valid java name */
    public static final PmsKey f92newmediaviewerenabled = new PmsKey("new-media-viewer-enabled", HttpStatus.SC_PROCESSING);

    /* renamed from: media-viewer-video-collage-enabled, reason: not valid java name */
    public static final PmsKey f80mediaviewervideocollageenabled = new PmsKey("media-viewer-video-collage-enabled", 103);

    /* renamed from: new-uploader-enabled, reason: not valid java name */
    public static final PmsKey f95newuploaderenabled = new PmsKey("new-uploader-enabled", 104);

    /* renamed from: mytracker-enabled, reason: not valid java name */
    public static final PmsKey f88mytrackerenabled = new PmsKey("mytracker-enabled", 105);

    /* renamed from: chat-video-autoplay-parallel-count, reason: not valid java name */
    public static final PmsKey f23chatvideoautoplayparallelcount = new PmsKey("chat-video-autoplay-parallel-count", 106);

    /* renamed from: chat-complaint-enabled, reason: not valid java name */
    public static final PmsKey f21chatcomplaintenabled = new PmsKey("chat-complaint-enabled", 107);

    /* renamed from: bot-complaint-enabled, reason: not valid java name */
    public static final PmsKey f11botcomplaintenabled = new PmsKey("bot-complaint-enabled", 108);

    /* renamed from: calls-sdk-audio-dynamic-redundancy, reason: not valid java name */
    public static final PmsKey f16callssdkaudiodynamicredundancy = new PmsKey("calls-sdk-audio-dynamic-redundancy", 109);

    /* renamed from: calls-sdk-net-disable-shared-socket, reason: not valid java name */
    public static final PmsKey f17callssdknetdisablesharedsocket = new PmsKey("calls-sdk-net-disable-shared-socket", 110);

    /* renamed from: conn-timeouts, reason: not valid java name */
    public static final PmsKey f26conntimeouts = new PmsKey("conn-timeouts", 111);

    /* renamed from: safe-mode-enabled, reason: not valid java name */
    public static final PmsKey f106safemodeenabled = new PmsKey("safe-mode-enabled", 112);

    /* renamed from: media-transform, reason: not valid java name */
    public static final PmsKey f79mediatransform = new PmsKey("media-transform", 113);

    /* renamed from: max-rate-call-threshold, reason: not valid java name */
    public static final PmsKey f72maxratecallthreshold = new PmsKey("max-rate-call-threshold", 114);

    /* renamed from: call-minimum-duration-to-rate, reason: not valid java name */
    public static final PmsKey f13callminimumdurationtorate = new PmsKey("call-minimum-duration-to-rate", 115);

    /* renamed from: call-rate, reason: not valid java name */
    public static final PmsKey f14callrate = new PmsKey("call-rate", 116);

    /* renamed from: send-queue-size, reason: not valid java name */
    public static final PmsKey f112sendqueuesize = new PmsKey("send-queue-size", 117);

    /* renamed from: webapp-ds-keys-count, reason: not valid java name */
    public static final PmsKey f132webappdskeyscount = new PmsKey("webapp-ds-keys-count", 118);

    /* renamed from: webapp-ss-keys-count, reason: not valid java name */
    public static final PmsKey f133webappsskeyscount = new PmsKey("webapp-ss-keys-count", 119);

    /* renamed from: webapp-biometry-enabled, reason: not valid java name */
    public static final PmsKey f131webappbiometryenabled = new PmsKey("webapp-biometry-enabled", 120);

    /* renamed from: ext-sharing-video, reason: not valid java name */
    public static final PmsKey f37extsharingvideo = new PmsKey("ext-sharing-video", 121);

    /* renamed from: chat-invite-link-permissions-enabled, reason: not valid java name */
    public static final PmsKey f22chatinvitelinkpermissionsenabled = new PmsKey("chat-invite-link-permissions-enabled", 122);

    /* renamed from: chat-animoji-enabled, reason: not valid java name */
    public static final PmsKey f20chatanimojienabled = new PmsKey("chat-animoji-enabled", 123);

    /* renamed from: edit-channel-type-screen-enabled, reason: not valid java name */
    public static final PmsKey f33editchanneltypescreenenabled = new PmsKey("edit-channel-type-screen-enabled", 124);

    /* renamed from: chat-anim, reason: not valid java name */
    public static final PmsKey f19chatanim = new PmsKey("chat-anim", 125);

    /* renamed from: send-logs-interval-sec, reason: not valid java name */
    public static final PmsKey f111sendlogsintervalsec = new PmsKey("send-logs-interval-sec", 126);

    /* renamed from: saved-messages-aliases, reason: not valid java name */
    public static final PmsKey f107savedmessagesaliases = new PmsKey("saved-messages-aliases", 127);

    /* renamed from: video-msg-enabled, reason: not valid java name */
    public static final PmsKey f128videomsgenabled = new PmsKey("video-msg-enabled", 128);

    /* renamed from: analytics-permissions, reason: not valid java name */
    public static final PmsKey f4analyticspermissions = new PmsKey("analytics-permissions", 129);

    /* renamed from: stat-session-background-threshold, reason: not valid java name */
    public static final PmsKey f116statsessionbackgroundthreshold = new PmsKey("stat-session-background-threshold", 130);

    /* renamed from: bot-start-param, reason: not valid java name */
    public static final PmsKey f12botstartparam = new PmsKey("bot-start-param", 131);

    /* renamed from: js-download-delegate, reason: not valid java name */
    public static final PmsKey f55jsdownloaddelegate = new PmsKey("js-download-delegate", 132);

    /* renamed from: esia-enabled, reason: not valid java name */
    public static final PmsKey f36esiaenabled = new PmsKey("esia-enabled", 133);

    /* renamed from: new-admin-permissions, reason: not valid java name */
    public static final PmsKey f91newadminpermissions = new PmsKey("new-admin-permissions", 134);

    /* renamed from: media-order, reason: not valid java name */
    public static final PmsKey f78mediaorder = new PmsKey("media-order", 135);

    /* renamed from: bad-networ-indicator-config, reason: not valid java name */
    public static final PmsKey f10badnetworindicatorconfig = new PmsKey("bad-networ-indicator-config", 136);

    /* renamed from: webm-stickers-enabled, reason: not valid java name */
    public static final PmsKey f134webmstickersenabled = new PmsKey("webm-stickers-enabled", 137);

    /* renamed from: avatars-screen-enabled, reason: not valid java name */
    public static final PmsKey f9avatarsscreenenabled = new PmsKey("avatars-screen-enabled", 138);

    /* renamed from: new-session-logic, reason: not valid java name */
    public static final PmsKey f93newsessionlogic = new PmsKey("new-session-logic", 139);

    /* renamed from: analytics-enabled, reason: not valid java name */
    public static final PmsKey f3analyticsenabled = new PmsKey("analytics-enabled", 140);

    /* renamed from: mytracker-log-level, reason: not valid java name */
    public static final PmsKey f89mytrackerloglevel = new PmsKey("mytracker-log-level", 141);

    /* renamed from: show-vpn-snackbar, reason: not valid java name */
    public static final PmsKey f115showvpnsnackbar = new PmsKey("show-vpn-snackbar", 142);

    /* renamed from: search-webapps-showcase, reason: not valid java name */
    public static final PmsKey f109searchwebappsshowcase = new PmsKey("search-webapps-showcase", 143);

    /* renamed from: unsafe-files-alert, reason: not valid java name */
    public static final PmsKey f125unsafefilesalert = new PmsKey("unsafe-files-alert", 144);

    /* renamed from: player-load-control, reason: not valid java name */
    public static final PmsKey f99playerloadcontrol = new PmsKey("player-load-control", 145);

    /* renamed from: new-settings-storage-screen-enabled, reason: not valid java name */
    public static final PmsKey f94newsettingsstoragescreenenabled = new PmsKey("new-settings-storage-screen-enabled", 146);

    /* renamed from: max-video-message-length, reason: not valid java name */
    public static final PmsKey f77maxvideomessagelength = new PmsKey("max-video-message-length", 147);

    /* renamed from: settings-entry-banners, reason: not valid java name */
    public static final PmsKey f114settingsentrybanners = new PmsKey("settings-entry-banners", 148);

    /* renamed from: appearance-multi-theme-screen-enabled, reason: not valid java name */
    public static final PmsKey f6appearancemultithemescreenenabled = new PmsKey("appearance-multi-theme-screen-enabled", 149);

    /* renamed from: net-client-dns-enabled, reason: not valid java name */
    public static final PmsKey f90netclientdnsenabled = new PmsKey("net-client-dns-enabled", 150);

    private static final /* synthetic */ PmsKey[] $values() {
        return new PmsKey[]{f113setunreadtimeout, proxy, f129videopreview, f27debugmode, f101proxydomains, f48imagewidth, f45imageheight, f46imagequality, f47imagesize, f70maxmsglength, f71maxparticipants, f63maxaudiolength, f75maxthemelength, f65maxdescriptionlength, f35edittimeout, f24chatspagesize, f56keepconnection, f117stickersections, f118stickerssuggestion, f52invitelink, f54inviteshort, f53invitelong, f51inviteheader, f64maxcnamelength, f126vsizegrp, f122ticereconnect, f42fileuploadmaxsize, f43fileuploadunsupportedtypes, f87musicfilesenabled, f25chatspreloadperiod, f67maxfavoritechats, f30disconnecttimeout, f62maxattachcount, f102pushalerttimeout, f57livelocationenabled, f58livelocationreleasedate, f59livelocationsendtimeout, f120supportaccount, f121supportemail, f130wakelockonpush, mentions_entity_names_limit, f73maxreadmarks, f76maxvideodurationdownload, f123talkingonmutedmictriggerdiff, f69maxfavoritestickers, f68maxfavoritestickersets, f84minstickersize, f74maxstickersize, f29defaultstickersize, f83minimagesidesize, f82mindurationsaveaudiostarttime, f127validintervalaudiostarttime, f81mindurationplaybackspeed, f32draftssyncenabled, f7audiotranscriptionlocales, f108scheduledmessagesenabled, f124tracernonfatalcrashedenabled, f119subscriptiontimeoutseconds, f31doubletapreaction, f104reactionsmax, f103reacterrors, f86msggetreactionspagesize, f140wmworkerslimit, f139wmcheckworkerscountintervalsec, f138wmbacklogworkercheckdelaysec, f137wmbacklogworkerbackoffdelaysec, f141wmworkersoffset, f136wmanalyticsenabled, f100progressdifffornotify, f142workerprogresstimedifffornotifyms, f66maxdownloadedsizefornotifykb, f41fbexecreplace, f40fbexecmodifiersnames, f60logfull, f61logsensitive, f5anrconfig, f28debugprofileinfo, f15callsendpoint, f38fakechats, f18channelsenabled, f8availablecomplaints, f49inappreviewtriggers, f39fakeinappreview, f50invitefriendssheetfrequency, f135welcomestickerids, f85moneytransferbotid, f98noncontactsynctime, f97noncontactmaxchunksize, f96noncontactcollectioninterval, f34editchattypescreenenabled, gce, lgce, sse, gsse, grse, gcas, gcwre, gcmpe, f44groupcallchatsupport, f2accountnicknameenabled, f110sendlocationenabled, f105reconnectcallringtone, f92newmediaviewerenabled, f80mediaviewervideocollageenabled, f95newuploaderenabled, f88mytrackerenabled, f23chatvideoautoplayparallelcount, f21chatcomplaintenabled, f11botcomplaintenabled, f16callssdkaudiodynamicredundancy, f17callssdknetdisablesharedsocket, f26conntimeouts, f106safemodeenabled, f79mediatransform, f72maxratecallthreshold, f13callminimumdurationtorate, f14callrate, f112sendqueuesize, f132webappdskeyscount, f133webappsskeyscount, f131webappbiometryenabled, f37extsharingvideo, f22chatinvitelinkpermissionsenabled, f20chatanimojienabled, f33editchanneltypescreenenabled, f19chatanim, f111sendlogsintervalsec, f107savedmessagesaliases, f128videomsgenabled, f4analyticspermissions, f116statsessionbackgroundthreshold, f12botstartparam, f55jsdownloaddelegate, f36esiaenabled, f91newadminpermissions, f78mediaorder, f10badnetworindicatorconfig, f134webmstickersenabled, f9avatarsscreenenabled, f93newsessionlogic, f3analyticsenabled, f89mytrackerloglevel, f115showvpnsnackbar, f109searchwebappsshowcase, f125unsafefilesalert, f99playerloadcontrol, f94newsettingsstoragescreenenabled, f77maxvideomessagelength, f114settingsentrybanners, f6appearancemultithemescreenenabled, f90netclientdnsenabled};
    }

    static {
        PmsKey[] pmsKeyArr$values = $values();
        $VALUES = pmsKeyArr$values;
        $ENTRIES = new v25(pmsKeyArr$values);
        Companion = new e5b();
        keys$delegate = new khe(new s4a(27));
    }

    private PmsKey(String str, int i) {
    }

    public static u25 getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map keys_delegate$lambda$1() {
        u25 entries = getEntries();
        int iZ = mz7.Z(z53.S(entries, 10));
        if (iZ < 16) {
            iZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iZ);
        for (Object obj : entries) {
            linkedHashMap.put(((PmsKey) obj).name(), obj);
        }
        return linkedHashMap;
    }

    public static PmsKey valueOf(String str) {
        return (PmsKey) Enum.valueOf(PmsKey.class, str);
    }

    public static PmsKey[] values() {
        return (PmsKey[]) $VALUES.clone();
    }

    public final String fullContentString$prefs_release() {
        return zr6.i("\"", name(), "\"");
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }
}

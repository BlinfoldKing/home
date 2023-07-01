export const Header = () => (
  <header className="header z-50 with-bg">
    <nav className="flex flex-col justify-center">
      <a className="nav-item p-2 mgc_home_2_line" href="/" />
      <a className="nav-item p-2 mgc_news_line" href="/posts" />
      <a className="nav-item p-2 mgc_user_2_line" href="/about" />
      <a
        className="nav-item p-2 mgc_github_line"
        target="_blank"
        href="https://github.com/blinfoldking"
      />
      <a className="nav-item p-2 mgc_sun_line" />
    </nav>
  </header>
);

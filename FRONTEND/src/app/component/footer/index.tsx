
import github from "../../../assets/img/drodrigues17.svg";
import "./style.css";

export default function Footer() {
  return (
    <footer className="site-identity footer-container">
      <div className="footer-line" />
      <a
        className="criador"
        href="https://github.com/DRodrigues17"
        target="_blank"
        rel="noreferrer"
      >
        <img src={github} alt="" />
      </a>
    </footer>
  );
}
